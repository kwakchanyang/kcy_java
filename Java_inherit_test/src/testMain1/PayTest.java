package testMain1;

public class PayTest {

	public static void main(String[] args) {
		
		CreditCard Credit = new CreditCard(45000,"2023.12.03");
		CheckCard Check = new CheckCard(140000,"2024.07.12");
		Cash C = new Cash(3500,"2023.02.25");
		Account A = new Account(60000,"2025.04.11");
		
		Credit.processPay();
		Check.processPay();
		C.processPay();
		A.processPay();

	}

}
