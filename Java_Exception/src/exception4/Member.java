package exception4;

public class Member {
	private String name;
	private int age;
	
	public Member() {}
	public Member(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void nameCount() throws NullPointerException{
		
		if(name==null) {
			throw new NullPointerException("이름 입력안함");
			// 예외 발생 시키기 - throw
			// 원래는 프로그램이 알아서 에러를 탐지하고 처리 하였지만, 이번에는 사용자가 일부러 에러를 throw하여 에러를 catch 한다는 개념
		
		}
		if(name.length()==2) {
			System.out.println("이름이 외자이다");
		}else if(name.length()==4) {
			System.out.println("이름이 3자이다");
		}else if(name.length()==3) {
			System.out.println("이름이 2자이다");
		}
		
	}
	
	public int getBirthYear() throws Exception {
		if(age==0) {//나이 입력 안한 경우
			throw new Exception("나이 입력안함");
		}
		return 2025-age; //return이 안되고 종료되기 때문에 thorws Exception을 반환해줘야함.
		
	}
}
