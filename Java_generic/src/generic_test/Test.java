package generic_test;

public class Test {

	public static void main(String[] args) {
		
//		포스틱 p = new 포스틱("스윙칩",1200);
//		포스틱 p1 = new 포스틱("포카칩",1600);
//		매운새우깡 sp = new 매운새우깡("고구마깡",1400);
//		예감 ye = new 예감("구운감자",1600);
//		예감 yes = new 예감("프링글스",1800);
//		
		
		SnackBox<포스틱> 박스1 = new SnackBox<>();//박스1이가지는건 스낵박스객체
		박스1.makeBox(new 포스틱("포스틱",1500));
		
		Snack 포스틱2 = new 포스틱("포스틱",1700); // 부모클래스타입에 자식클래스받을수있음.
		// 포스틱2라는 매개변수를 넘겨주는거니까 포스틱2의 타입인 Snack을 넣어줘야함 > 포스틱넣으면 오류 why?int타입에 float넣는꼴 > 형변환필요
//					┌┘	매개변수에 포스틱넣어줄꺼면 박스2.makeBox((포스틱)포스틱2)로 강제형변환해주기
		SnackBox<Snack> 박스2 = new SnackBox<>();
		박스2.makeBox(포스틱2);
		
		Snack[] 과자배열 = new  Snack[] {
			new 예감("예감",1300), new 매운새우깡("매운새우깡",1400),
			new 매운새우깡("매운새우깡",1500)
		};
		
		SnackBox<Snack> 박스3 = new SnackBox<>();
		박스3.makeBox(과자배열[0]);
		SnackBox<Snack> 박스4 = new SnackBox<>();
		박스4.makeBox(과자배열[1]);
		SnackBox<Snack> 박스5 = new SnackBox<>();
		박스5.makeBox(과자배열[2]);
		
		// 이렇게 스낵자체를 배열로 만들면 안되나??? 안됨
		SnackBox<Snack>[] a = new SnackBox[3]; //new쪽에는 타입지정안됨 > 최상위 오브젝트타입임
		a[0] = new SnackBox<Snack>(); // 오브젝트공간인데 이형태를 넣어준다? 부모타입공간에 자식클래스를 넣어주겠다. > 자식클래스가 가지는것 사용못함
		// 제네릭사용하는 클래스는 배열사용못함!
		

	}

}
