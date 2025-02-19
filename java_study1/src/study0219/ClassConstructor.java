package study0219;

public class ClassConstructor {

	public static void main(String[] args) {
		
		Food f1 = new Food("돈까스",8000);
		
		System.out.println(f1.foodName);
		
		Food f2 = new Food();

//		기본생성자 메서드가 존재하기에 Food() 실행됨
//		클래스내부에 매개변수로 생성된 메서드가 하나밖에 없다면 Food()를 사용할 수 없음
//		아예 없었다면 기본Food()를 사용할 수 있다.
//		그러므로 매개변수 메서드를 만들고 나서 기본생성자Food()를 사용하려면 클래스 내부에
//		Food(){}를 넣어줘야한다.
		
/*		상품
 * 		상품명, 브랜드, 수량
 * 		
 * 		상품을 등록하고자 하는데 필요한 클래스를 정의하고
 * 		상품 정보 저장하기 위한 생성자메서드를 아래와 같이 구현
 * 			-기본 생성자 메서드
 * 			-상품명과 수량 초기화 가능한 생성자 메서드
 * 			-상품명, 브랜드, 수량 초기화 가능한 생성자 메서드
 */
		
		Items Item1 = new Items("연필",45);
		System.out.println("상품이름:"+Item1.name+" 수량:"+Item1.stocks);
		Items Item2 = new Items("지우개","모나미",60);
		System.out.println("상품이름:"+Item2.name+" 브랜드:"+Item2.brands+" 수량:"+
		Item2.stocks);
		Items Item3 = new Items();
		System.out.println(Item3);

	}

}


/*
 * 		메서드(함수)
 * 		객체가 존재해야지만 사용가능(객체에 귀속되어있음)
 * 		출력타입(반환타입) 메서드이름(매개변수){
 * 			메서드 내용
 * 		}
 * 
 * 
 * 		매개변수가 필요한경우 : 바깥쪽에 있는 데이터를 매서드내용쪽에서 사용하고자 할 때(연결시켜주는 역할)
 * 		매개변수가 필요없는경우 : 함수나메서드 내부에서 자체적으로 데이터를 만들어낼 수 있는 경우
 * 						   키보드 입력받을때
 * 		1. 매개변수가 필요없는경우(내가 가지고 있는 함수를 씀)
 * 		int sum(){
 * 			int num1=10;
 * 			int num2=20;
 * 			System.out.println(num1+num2);
 * 		}
 * 		
 * 		2. 매개변수가 필요한 경우
 *      int sum(int a, int b){
 * 			int num1=a;
 * 			int num2=b;
 * 			System.out.println(num1+num2);
 * 		}
 * 
 * 		int x=23, y=2345; // 데이터가 매서드의 외부에 있으니 매개변수통해 연결시켜야함.
 * 		sum(x,y);
 * 
 * 
 */


