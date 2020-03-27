package shopping.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.Data;

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

	public UserVO() {}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public void insertBirth() {
		String date = LocalDate.of(this.year, this.month, this.day).format(DateTimeFormatter.BASIC_ISO_DATE);
		birth = date;

	}

}
