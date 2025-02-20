package study0220;

public class JavaMethod2 {

	public static void main(String[] args) {
		Member user1 = new Member();
		user1.id=1001;
		user1.userId="sky";
		user1.password="1234";
		
		//user1.output();
		System.out.println(user1);
		
		Member user2=new Member("gold","5432",1002);
		
		user2.output();
		
		String word = "이렇게 한다";
		System.out.println(word);// 원래는 word.toString()이라고 해야함.
	}

}
