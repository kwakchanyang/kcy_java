package exception4;

public class MainMt {

	public static void main(String[] args) {
	
		Member m1 = new Member();
		Member m2 = new Member("김유신",25);
		
//		m1.nameCount(); // name이 null이라서 name.length사용불가라서 오류뜸 예외처리 null해주면 throw오류메세지뜸.
		m2.nameCount();
		
		try { // 실제 실행되는 부분은 여기(객체만들고 실행해라) > 어디서 오류났는지 파악가능
			int a = m1.getBirthYear();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}


/*
 	오류 발생이 예상되는 코드에 try{}catch(){}를 넣어준다.
 	오류는 대부분 입력, 계산, 인덱스, 참조변수활용에서 많이 발생한다.
 		이유 -> 사용자조작과 밀접하기에
 		
 	try{}에서 발생한 오류는 catch로 넘어가게 된다.
 	catch에서는 오류에 맞는 예외클래스를 사용토록 하는게 좋지만
 	어떤 오류가 발생할지 예상하기 어려운경우 부모클래스로 받는것도 방법
 	
 	try {
 		코드1;
 		코드2;
 		코드3;
 	}catch(예외클래스 클래스참조변수){
 		오류일 경우 사용자알림 메세지
 	}
 	
 	예외를 강제 발생 시키기(오류 발생)
 	throw new 예외클래스("메세지");
 	주로 테스트에서 사용
 	
 	예외 던지기
 	메서드 이름 뒤에 throws 예외클래스
 	어떤 객체에 의해 오류가 발생했는지 확인하고자 할경우
 	메서드에서 예외 던지기를 한다.
 
 */
