package study0224;

public class JavaDefault1 {
	
	static void sum() {
		
	}

	public static void main(String[] args) {
		sum(); // 만약 void sum(){}이면 여기서 사용못함.
		Member m1 = new Member(); // 객체생성, 인스턴스생성
		
		System.out.println(m1.name);
		System.out.println(m1.count); // count=1
		System.out.println(Member.count); // 클래스이름으로 변수호출가능 static int count; 
											// 클래스 변수는 모든객체들이 사용할수있기때문에
		Member m2 = new Member();
		System.out.println(m2.count); // count=2 객체의 개수를 알아낼 수 있음
//		count □ <- m1□(나는1번이야)m2□(나는2번이야) 공동으로 사용하는거라 객체에 영향을 줌
//		m1을 다시 출력한다면 나는2번이야가 뜸
//		m1이 count객체를 사용하고 있다면 m2가 count사용하지 못하게 막아줘야함

	}

}
