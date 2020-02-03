package shopping.vo;

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

}
