package customer;

import store.Banana;
import store.Fruit;
import store.Grape;
import store.Orange;

public class MainMethod {

	public static void main(String[] args) {
		// 바나나와 포도, 오렌지 갯수가 많이 필요하다면?
		Banana[] ba = new Banana[15];
		
//		ba[0] = new Banana(2500,500); > 아직 Banana객체 없기에 null이기에 오류
		
//		ba[0] = new Banana(2500,500);
//		ba[1] = new Banana(3500,500);
//		ba[2] = new Banana(4500,500);
//		ba[3] = new Banana(5200,500);
//		
//		ba[0] = new Banana(2500,500); // 바나나 주스 제조
		
		// 다형성 - 하나의 타입으로 여러타입을 다룰 수 있다.표현할 수 있다?
		// 	상속 관계, Implements 
		
//		Fruit f = new Banana(2500,500);
//		f.makeJuice();
//		Fruit g = new Grape(3500,200);
//		g.makeJuice();
//		 ┌타입 
		Fruit[] menu = new Fruit[10]; // >얘는 객체만드는 과정이 아님
		menu[0] = new Banana(2500,350);
		menu[1] = new Banana(3000,400);
		menu[2] = new Orange(3500,400);
		menu[3] = new Banana(3500,500);
		menu[4] = new Grape(4500,350);
		menu[5] = new Banana(4500,550);
		menu[6] = new Grape(5000,450);
		menu[7] = new Orange(4000,350);
		menu[8] = new Orange(5000,550);
		menu[9] = new Grape(6000,600);
		
//		menu[2].makeJuice();
//		menu[6].pieceFruit();
		
		Buyer ctm1 = new Buyer(10000); //구매자
		
		for(Fruit m : menu) {
			System.out.println(m);
			//출력 결과 -> 바나나 2500원 350ml
		}
		System.out.println(ctm1);
		
		// 출력결과 -> 보유머니: 10000원
	
		
//		System.out.println("보유머니: "+ctm1.getMoney());

	}

}
