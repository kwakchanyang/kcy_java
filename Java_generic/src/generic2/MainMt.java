package generic2;

public class MainMt {

	public static void main(String[] args) {
		
//		Bottle<String> b1 = new Bottle<String>();
//		// Bottle클래스의 제네릭 타입으로 String지정
//		// String item으로 변경,
//		// make메서드의 매개변수 String item으로 변경
////		b1.make(new String("레몬소주")); 원래는 이렇게 작성해야함. 편의를 위해 밑에처럼 작성가능
//		b1.make("레몬소주");
		
		Soju sj = new Soju("참이슬","진로",16);
		Wine wn = new Wine("디안느소비뇽","앙드레뤼통",12); 
		Makgeolli mg = new Makgeolli("공주밤막걸리","사곡양조원",6);
		Alcohol aaaa=sj; // 자식을 부모에 넣어주는건 아무문제 없음
//		sj.aa();
		
		Bottle<Soju> 참이슬 = new Bottle<>(); 
		// Bottle클래스 객체를 만들고 item이라는 변수에 Soju객체를 넣은거지 Soju클래스의 객체만든게 아님
		// Bottle클래스의 제네릭 타입으로 Soju지정
		// Soju item으로 변경,
		// make메서드의 매개변수 Soju item으로 변경
		참이슬.make(sj); //┌여기의 item은 Soju타입임 
		Soju al = 참이슬.item; // 부모의 타입이 자식의 타입으로 넘어갈수없음
		// int a=10; flaot b = 3.14; b=a;(얘만가능) a=b;
		// 강제형변환 해줘야함 
//		al.aa(); // aa는 자식이 가지고있음. Alcohol이라는 클래스에는 없음
//		┌─────타입─────┐
		Bottle<Alcohol> 술병 = new Bottle<>(); // 제네릭타입의 매개변수는 생략가능
		술병.make(wn);
		
//		술병 = 참이슬; 술병,참이슬은 Bottle클래스임 > 같은 타입인데도 안들어가짐
//		참이슬이 자식이고 술병이 부모임 > 그래도 안됨.
//		객체generic은 부모자식안따짐. 내부적인 generic의 성질이 다르기 때문에Alcohol이랑Soju일뿐 남남임
		

		Alcohol ach = sj;
		
		
		Bottle<Wine> 소비뇽 = new Bottle<>();
		소비뇽.make(wn);
		
		Bottle<Makgeolli> 밤막걸리 = new Bottle<>();
		밤막걸리.make(mg);
		
		Bottle<Alcohol> 소주병 = new Bottle<>();
		소주병.make(sj);
		
//		Bottle<Toy> 티니핑 = new Bottle<>();
//		티니핑.make(new Toy());
		
//		소주병.make(new Toy());
		
		
		Service 은호 = new Service();
		은호.drink(참이슬);// soju=참이슬에 저장해라. 
		
		Service 수영 = new Service();
		수영.drink(밤막걸리);
		
		
	}

}


/*
	Bottle<String> b1 = new Bottle<String>();
 	String item;
 	 	
 	public Bottle(String item) {
		System.out.println("만들기");
		this.item=item;
		System.out.println(item);
	}
 
*/


/*
	제네릭 - 클래스 내부에 사용할 타입을 외부에서 지정하는 방법
		Member<Admin> a = new Member<>();
		-> Member클래스 내부에 Admin이라는 타입을 사용한다.
		-> Member클래스는 class Member<T>로 정의되어 있어야 한다.
		-> 클래스내부의 인스턴스변수나 인스턴스 메서드의 매개변수 타입또는 반환타입을
			제네릭타입으로 표현 가능하다
	Member<Admin> a = new Member<>()은 Admin클래스의 객체생성이 아니다.
	Member클래스의 객체생성이다.
	
		- 제네릭을 사용하는 클래스인경우 해당 클래스의 참조변수들은 Member<Admin>까지를
		타입으로 인지한다.
		-제네릭에서는 상하관계가 없다.(제네릭 타입으로 부모클래스나 자식클래스를 사용해도
		대입연산이 이루어지지 않는다.)
		- 제네릭을 사용하므로 타입에 대한 예외상황을 방지할 수 있다.
			(컴파일 과정에서 발생할 수 있는 오류 최소화)
		- 제네릭 사용범위 제한은 extends와 super이다.
		- 메서드에만 제네릭사용되는 경우 와일드카드(?)를 사용하는게 여러 타입처리가능
		- 와일드카드의 범위 제한은 extends,super이다.



*/
