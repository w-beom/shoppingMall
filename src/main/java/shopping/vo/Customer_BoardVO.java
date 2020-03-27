package shopping.vo;


import java.sql.Timestamp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer_BoardVO {
	private int customer_id;
	private String customer_subject;
	private String customer_content;
	private String id;
	private int user_id;
	private Timestamp customer_date;
}
