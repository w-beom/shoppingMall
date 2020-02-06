package shopping.vo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserVO {
	private int user_id;
	private String id;
	private String pw;
	private String name;
	private String birth;
	private String year;
	private String month;
	private String day;
	private String email;
	private String address;
	private String phone;
	private int year;
	private int month;
	private int day;
	private String birth;

	public UserVO(int year, int month, int day) {
		String date = LocalDate.of(year, month, day).format(DateTimeFormatter.BASIC_ISO_DATE);
		birth = date;
	}

}
