package shopping.vo;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class Customer_BoardVO {
	private int customer_id;
	private String customer_subject;
	private String customer_content;
	private String user_name;
	private String user_pw;
	private int user_id;
	private Timestamp customer_date;
}
