package thread1;

public class Create extends Thread{
	
	public static Dino egg=null; // 객체생성x, 누구나 사용가능, 공유
	
	public static void hatch(Dino dino) {
		egg=dino; // egg라는 변수는 하나만 저장 > 근데 부화시작전에 번호를 또 선택하면 그 번호로 바뀜. egg에 더이상 값이 못들어오게 하기 > 나중에 egg에 값이 들어오도록
	} // 스레드사용시 static자주 사용하는데 run메서드에서 egg를 사용하고있는데 main메서드에서 또 얘를 불러 사용하니까 변경됨 > 사용중에 다른애가 사용못하도록 막아줘야함
//	=> main메서드에서 공룡이부화끝나기전에는 선택이 안되도록 하기 > 
	
	// 메서드가 실행되는중에는 매개변수가 들어올수없음
	// 처음호출할때만 넣을 수 있음
	@Override // 오버라이딩이라 매개변수맘대로 넣을수없음 > {}내부만 변경 
	public void run() {
		while(true) {
			// egg가 null이 아니라면 부화를 시작해라 null이면 무한루프돌다가 값이 입력되면 밑에 if문 실행
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
