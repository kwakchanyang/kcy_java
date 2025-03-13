package thread1;
// Thread를 상속받으면 main메서드 실행하는것처럼 run메서드를 오버라이드하여 구현해주기 > 
// 스레드를 시작할때는 구혀한 run()메서드를 시작하는게 아닌 start()메서드를 시작해야 정상적으로 실행(병행처리 가능함)
public class Create extends Thread{
	
	public static Dino egg=null; // 정적변수 객체생성x, 누구나 사용가능, 공유(해당클래스의 객체들이 모두 사용가능)
	
	public static void hatch(Dino dino) {
		egg=dino; // egg라는 변수는 하나만 저장 > 근데 부화시작전에 번호를 또 선택하면 그 번호로 바뀜. egg에 더이상 값이 못들어오게 하기 > 나중에 egg에 값이 들어오도록
	} // 스레드사용시 static자주 사용하는데 run메서드에서 egg를 사용하고있는데 main메서드에서 또 얘를 불러 사용하니까 변경됨 > 사용중에 다른애가 사용못하도록 막아줘야함
//	=> main메서드에서 공룡이부화끝나기전에는 선택이 안되도록 하기 > 공중화장실(누구나 사용가능하더라고 한명이 사용중일때는 잠금장치를 해야함 > 그래야 다음에 쓸애가 아 누가사용중이구나를 인식하고 사용못하도록)
//      └ 처음공룡이 태어난후에 번호선택(1~4중하나)하는거 뜨게 하기	/ 화장실은 하나지만 그안에 나만의 칸을 설치해주기 (run메서드 안에서 따로 사용할 변수를 만듦) > 다음사람이 기다리지 않게 해주려면 스레드 하나 더 만들기
	
	
	// 메서드가 실행되는중에는 매개변수가 들어올수없음
	// 처음호출할때만 넣을 수 있음
	@Override // 오버라이딩이라 매개변수맘대로 넣을수없음 > {}내부만 변경 
	public void run() {
		Dino myEgg = null; // 지역변수
		while(true) {
			// egg가 null이 아니라면 부화를 시작해라 null이면 무한루프돌다가 값이 입력되면 밑에 if문 실행
			try {
				Thread.sleep(100);
			}catch(Exception e) {}

//egg에 값이 들어오고 myEgg에 null인 경우는 공룡알 부활 시작안한 상태
//egg에 값이 들어왔지만 myEgg변수가 값을 가진 경우는 부화 시작 한 상태
			if(egg != null && myEgg==null) { 
				myEgg=egg;// run이 실행중일때 외부데이터를 내부변수에 값전달
				egg=null; // 값 전달했으니까 다시 null
				System.out.println(myEgg.getName()+"부화 시작!");
				try {
					Thread.sleep(myEgg.getTime()*1000);
				} catch (Exception e) {}
				System.out.println(myEgg.getName()+" 공룡 태어남");
				myEgg=null; // 부화가 완료된후, egg를 다시 null로 초기화하여 새로운 공룡이 부화되도록 하기
				
			}
		}
	}
}


// 스레드에서 처음 실행되는 메서드가 run이다.
// 즉, run메서드가 종료되면 스레드 사라짐
