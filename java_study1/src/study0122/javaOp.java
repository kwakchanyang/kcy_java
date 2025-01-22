package study0122;

import java.util.Scanner;

public class javaOp {

	public static void main(String[] args) {
		int num = 20; // 대입연산자에 의해 오른쪽의 값을 왼쪽에 저장
		num = 20+3+1*10; // +, *연산 후 대입연산 실행
		int num2 = 10, num3 = 55;
		
		num = num2 + 13 / num3 + 123;
		// 대입연산자는 다른 연산자들보다 우선순위가 낮다.
		// 연산자높은순위 (),[],.(바로옆공간에 직접적접근),->(떨어지있는 공간안에 참조해서 접근=간접적)
		//연산자 순위 잘 생각해서 작성해야함 > 10+3*4=22인데 순서잘못하면 120라고 나올 수 있으니 순서 조심!
		
		//사칙연산자
		System.out.println(num2 + num3);
		System.out.println(num3 - num2);
		System.out.println(num2 * 4);
		System.out.println(num2 + num3 * 2); // *연산후 +연산
		System.out.println(num3 / num2); // /연산은 몫
		System.out.println(num3 % 4); // % 연산은 나머지 /홀짝구별 = 2로나눈 나머지가 1이면 홀수이고 2이면 짝수이다. 7%2=1(홀) 6%2=0(짝수)
		//예를 들어 게시물 페이지수를 할때 12%10=1이지만 한페이지당 10개씩한다면 2개가 필요하다. 1번조건.12/10=1 + 2번조건+1을 해줘라 >>2
		//숫자의 배수 = 나머지값이 0이면 약수,배수가됨
		System.out.println(10/3.0);//3.0이 실수니까 결과값도 실수가 나옴
		System.out.println(10%3.0);// %는 나머지에 초점 10%3.0=몫3.3333나머지0.666이 아니라(몫에대한나머지가아니ㅏ) 10%3.0=몫3나머지1임.
		
		//복합 대입 연산자(대입되는 변수(num)=계산되는 변수(num)가 같을때만 사용가능)
		num = 10;
		num = num + 20;
		num += 20; // num+20(더하기연산먼저)을 하고 num에 그값을 넣는다(대입연산을한다).
		num = num2 * 5;
		num2 *= 5;
		
		//num = num + 5 * num3;
		num += 5 * num3;
		
		Scanner scan = new Scanner(System.in); // 키보드입력받기위해 생성 Scanner입력하고 마우스대고 import클릭 or ctrl+space
		
		//원의 둘레 구하기
		int r=0, dist=0;
		System.out.printf("반지름 :");
		r = scan.nextInt();
		
		dist = (int)(r * 2 * 3.14); // dist는 정수라 했기 때문에 계산값(실수)의 타입이 맞지 않음 >> 강제형변환 하기! 또는 dist를 실수형으로 바꿔주기
		//큰쪽(실수)이 작은쪽(정수)로 이동하는 경우라 해준것. 그 반대면 형변환 하지 않아도 됨.
		
		System.out.println("원의 둘레 :" + dist); 
		
		
		
	}

}
