package shopping.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@PropertySource("classpath:/application.properties")
public class DatasourceConfig {

	@Autowired
	private ApplicationContext applicationcontext;
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari") //application.properties에서 spring.datasource.hikari로 시작하는 값들을 읽어온다.
	public HikariConfig hikariconfig() {
		return new HikariConfig();
	}
	
	
	@Bean
	public DataSource dataSource() {
		DataSource dataSource=new HikariDataSource(hikariconfig());
		System.out.println("Data soruce:"+dataSource);
		return dataSource;
	}
	//HikariConfig Bean을 이용해서 Datasource 객체 생성
	
	@Bean
	public SqlSessionFactory sqlSessionfactory(DataSource dataSource) throws Exception {
		//스프링 마이바티스에서는 SqlSessionFactory 생성하기 위해서 SqlSessionFactoryBean 객체를 이용
		SqlSessionFactoryBean sqlSessionBean=new SqlSessionFactoryBean();
		sqlSessionBean.setDataSource(dataSource);
		//sqlSessionBean.setMapperLocations(applicationcontext.getResources("classpath:/mapper/**/sql-*.xml"));
		//**: mapper폴더아래 모든하위폴더 sql-*.xml:sql-로 시작하는 모든파일
		
//		sqlSessionBean.setConfiguration(mybatisConfig());
		return sqlSessionBean.getObject();
	}
	
	
	//스프링 객체에서는 SqlSessionFactory -->sqlSession객체를 만들지않고
	//SqlSessionTemplate Bean을 만들어 사용합니다.
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionfactory) {
		return new SqlSessionTemplate(sqlSessionfactory);
	}
}
