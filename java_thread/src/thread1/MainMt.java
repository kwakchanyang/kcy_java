package thread1;

import java.util.Scanner;

public class MainMt {

	public static void main(String[] args) { // 첫번째 스레드에서 main메서드 실행 > myThread메서드 실행 > start()실행 > 두번째 스레드에서 run실행 > for실행
		
//		MyThread th1 = new MyThread("장은호"); // 객체 생성후 
//		th1.start(); // run메서드가 종료되니까 스레드 종료됨
//		
//		MyThread th2 = new MyThread("김명준");
//		th2.start();
//		
////		Test t = new Test();
////		t.testfor(); // 순서대로 실행 > testfor()가 끝나야 밑에 for문 실행됨.
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(" main메서드");
//			try {
//				Thread.sleep(1200);
//			} catch (Exception e) {
//			}
//		}
		
		
		Dino[] 알 = new Dino[] {
				
				new Dino("티라노사우르스", 10),
				new Dino("밸로시랩터",4),
				new Dino("프테라노돈",6),
				new Dino("스테고사우르스",7)
				
		};
		
		Create[] device = new Create[알.length];
		for(int i=0; i<알.length;i++) 
			device[i] = new Create();
		
		device[0].start(); device[1].start();
		device[2].start(); device[3].start();
//		알 갯수 만큼 스레드 만들었다 -> why? 알 최대치만큼 스레드있으면 좋을꺼같다는 개인적인 생각
		
		// 부화시킬 공룡 선택하여 부화진행할것이다.
		// 스레드를 통해 각 공룡별 시간만큼 동작하도록 할것이다.
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<알.length;i++) {
//			egg가 값이 있으면 = 부화/ 값이없다면 = 부화xx
			System.out.print("1~4중 알 하나 선택 : ");
			int select = sc.nextInt(); // run실행중에는 값을 넣어줄수없지만 egg클래스변수(static)통해 전달(인스턴스변수는안됨)
			
			Create.hatch(알[select-1]);// hatch라는 메서드통해 공룡알을 Create라는 클래스의 egg에 전달해줌
			System.out.println((i+1)+"번 부화장치 가동");
			
			System.out.print("계속 할꺼야?(1-계속) : ");
			if(sc.nextInt()!=1)
				break; // 1을 입력해야 계속할수있다.
			
		} // 얘는 4번반복이지만 두번째 스레드는 계속 살아있음.

//		티라노 객체를 받고 run안의 지역변수에게 넣어주기 > egg를 null로 바꿔도 지역변수에 담겼으니 티라노는 아직 살아있음 > 
	}

}

//  스레드
/*	
	포르세스란? - 운영체제 (윈도우같은거)에서 프로그램을 실행 시키는 단위
		운영체제에서 프로그램을 실행 시키려면 관리가 필요하다.
		운영체제에 의해서 프로그램이 실행되는 것이고 각 프로그램의 
		메모리는 운영체제로부터 할당 받아 사용하게 된다.
		모든프로세스는 고유한 아이디를 가지고 있다.
		이런 아이디를 프로세스라고 한다.
		하나의 프로세스는 반드시 하나 이상의 스레드를 가져야 동작한다.
		
	스레드란?
		프로세스의 명령처리 단위
	
	원 스레드의 장점
		- 컴퓨터의 자원 소모 감소
		- 오류관리, 디버깅이 쉽다.
		- 명령코드 실행에서 충돌 방지
		- 오류가 발생해도 예외처리가 쉽다.
		
	멀티 스레드 장점
		- cpu 코어 컨텍스트 스위칭 값 감소
		- 데이터 주고 받는것이 간단해짐
		- 응답 시간 단축
		- 네트워크 환경에 적합
		
	스레드의 생명주기
	1. new(스레드 생성)
	2. runnable 상태 (실행준비)
	3. running 상태 (실행)
		- wait, sleep, suspend에 걸리면 
		-> 대기 상태
		-> 대기 상태에서 resume, notify, sleep time up에 의해
		-> 실행 준비 상태로 변경
	4. terminated 상태 (소멸)
	

*/