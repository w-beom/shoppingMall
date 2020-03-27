package shopping.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data
public class UserVO {
	private int user_id;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private String phone;
	private int year;
	private int month;
	private int day;
	private String birth;
	
	public UserVO() {
		
	}
	
	public void insertBirth() {
		String date = LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.BASIC_ISO_DATE);
		birth = date;
		
	}

}
