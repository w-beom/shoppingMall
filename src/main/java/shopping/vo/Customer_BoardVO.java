package shopping.vo;


import java.sql.Timestamp;


public class Customer_BoardVO {
	private int customer_id;
	private String customer_subject;
	private String customer_content;
	private String id;
	private int user_id;
	private Timestamp customer_date;
	
	public Customer_BoardVO() {}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_subject() {
		return customer_subject;
	}
	public void setCustomer_subject(String customer_subject) {
		this.customer_subject = customer_subject;
	}
	public String getCustomer_content() {
		return customer_content;
	}
	public void setCustomer_content(String customer_content) {
		this.customer_content = customer_content;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Timestamp getCustomer_date() {
		return customer_date;
	}
	public void setCustomer_date(Timestamp customer_date) {
		this.customer_date = customer_date;
	}
	
	
	
	
}
