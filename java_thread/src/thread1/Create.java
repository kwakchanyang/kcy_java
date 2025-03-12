package thread1;

public class Create extends Thread{
	
	public static Dino egg=null; // 객체생성x, 누구나 사용가능, 공유
	
	public static void hatch(Dino dino) {
		egg=dino;
	}
	
	// 메서드가 실행되는중에는 매개변수가 들어올수없음
	// 처음호출할때만 넣을 수 있음
	@Override // 오버라이딩이라 매개변수맘대로 넣을수없음 > {}내부만 변경 
	public void run() {
		while(true) {
			// egg가 null이 아니라면 부화를 시작해라 null이면 아무것도 하지마라
			try {
				Thread.sleep(50);
			}catch(Exception e) {}
			
			if(egg != null) {
				System.out.println("부화 시작!");
				try {
					Thread.sleep(egg.getTime()*1000);
				} catch (Exception e) {}
				System.out.println(egg.getName()+" 공룡 태어남");
				egg=null;
				
			}
		}
	}
}


// 스레드에서 처음 실행되는 메서드가 run이다.
// 즉, run메서드가 종료되면 스레드 사라짐
