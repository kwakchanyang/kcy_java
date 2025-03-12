package CustomerService;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Inquiry {
	private int id = 0;
	private String title;
	private String context;
	private String CustomerInfo;
	private String state = "접수됨";
	private String registerTime;
}
