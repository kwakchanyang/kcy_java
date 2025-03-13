package thread1;
//								┌자바 내장 함수
public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name); // 부모클래스(Thread)에 닉네임저장
	}
	

	// 스레드를 생성하여 동작되게 하려면 run 메서드가 필요하다.
	// 기존의 프로그램(프로세스)는 main메서드부터 시작
	// 새로 만들어준 스레드는 run메서드 부터 시작
	// 공룡키우기게임 > 알부화장1개에서 10개 키우려면 1개씩 넣어줘야 한다. 1개당5일걸려서 온도조절해주고 먹이주고 해야 부화한다고 치자 > 5*10=50일 걸린다 / 현질을 해서 알부화장을1개 더 산다면?? 50일/2=25일 걸림.
	// 내가 채팅을 치고있는 와중에는 친구가 올린사진이나 글을 가져오지 못함 > 스레드가 1개인경우 > 스레드가 여러개일떄 여러작업을 할 수 있음
	@Override
	public void run() {
		System.out.println("스레드 시작!");
		for(int i=1; i<=10;i++) {
			
			System.out.println(i+this.getName());
			try {
				Thread.sleep(1000); // 1초동안 대기상태 > 풀림 반복 >> 1초에 한번씩 찍어주는 for문
			} catch (Exception e) {
				
			}
		}
	}
	
}

// 스레드 구현 방법
// 1. Thread 클래스 상속
// 2. Runnable 인터페이스 구현

