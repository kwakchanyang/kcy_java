package innerTest;

public class MainMethod {

	public static void main(String[] args) {
		
		Tire tire = new Tire();
		tire.setInch(18);
		
		Car car = new Car(tire);
//								┌car객체이있는 tire에 갔다가 inch를 꺼내옴
		System.out.println(car.getTire().getInch());
	}

}

// 상속관계와 포함관계(아니다:부정 했을때)
//   차     바퀴 > 포함관계(바퀴는 차가 아니다.맞음 차는 바퀴가 아니다.맞음) > 둘다아닌경우가 포함
//  사람 	   개발자(사람이 가질수있는 하나가 개발자임 사람은개발자다x개발자는사람이다o>하나만 맞음) > 상속관계
//  직업	  프로그램개발자(여러직업중 하나일뿐, 프로그램개발자가 있어야 직업이 되는건 아님)
//  과일 		오렌지  오렌지혼자서 과일이라 칭할수있다. 오렌지가 있어야 과일이 될수있나?아님.
// 필기도구	볼펜(상속관계)
// 대부분포함관계는 부품과 완성품??
