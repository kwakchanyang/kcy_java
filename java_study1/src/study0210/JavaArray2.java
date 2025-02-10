package study0210;

import java.util.Scanner;

public class JavaArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 7개 정수를 저장 할 수 있는 배열을 선언하고
		// 정수 7개 입력한뒤 모두 출력하세요.
		
//		int[] num = new int[7]; // 7의크기 배열(7개공간)
//		
//		for(int i=0;i<num.length;i++) {
//			System.out.println("숫자 입력:");
//			num[i]=sc.nextInt();
//		}
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]); // 0번 인덱스부터 6인덱스까지
		
		
//		}
		
//		final int size = 10; //final붙여서 사용하기 
//		
//		int[] age = new int[size];
//		// 정적 배열은 지정된 크기를 변경하기 어렵다.
//		// 프로그램실행시 컴파일 과정에서 배열의 크기가 정해져 있어야
//		// 그만큼 공간을 할당 받는데 배열의 크기가 확정되어 있지않으면
//		// 컴파일 과정에서 공간을 할당받지 못한다.
//		// (윈도우에 의해 필요한 만큼 대여받는건데 정확한 크기가 없으면 대여안해줌.)
//		age[0]=10;
//		System.out.println(age[0]);
		
//		int[] sum = new int[3];
//		int[] a = new int[] {10,20,30}; // 뒤에 배열을 적는 경우에는 크기지정 하지말기
//		int[] b = new int[] {1,5,9};
//		
//		// a배열과b배열의 합을 sum에 저장
//		sum[0] = a[0]+b[0];
//		sum[1] = a[1]+b[1];
//		sum[2] = a[2]+b[2];
//		
//		for(int i=0;i<sum.length;i++) { // 지금은 배열의 크기가 같으니 아무거나 넣기. 가장배열의크기가 큰or작은애를 범위에 넣기
//			sum[i]=a[i]+b[i];
//			System.out.println(sum[i]);
//		}
		
		
		// a와b 배열의 데이터를 total배열에 저장하기
		//a배열의 값 먼저 정하고 이어서 b배열의 값 저장될수 있게!!
//		int[]total=new int[10];
//		int[]a=new int[] {10,20,30,40,50};
//		int[]b=new int[] {55,44,33,22,11};
		
		// -------for문 2개로 만들기------------
//		for(int i=0;i<a.length;i++) {
//			total[i]=a[i]; // total[0]=a[0], total[1]=a[1].....
//		}
//		
//		for(int i=0;i<b.length;i++) {
//			total[i+5]=b[i];	//total[5]=b[0], total[6]=b[1]....
//			System.out.println(total[i]);
//			
//		}
		
		//---------for문 1개로 만들기-----------
//		for(int i=0;i<a.length;i++) {
//			total[i]=a[i];
//			total[i+5]=b[i];		
//		}
//		for(int i=0;i<total.length;i++) {
//			System.out.println(total[i]);
//		}
//		
////		
//		
//		char[] name = new char[5]; // |j|o|h|n| | =>이런식으로 저장됨.  // 주소를먼저받고 이에 해당하는 문자를 출력함.
//		name[0]='j';
//		name[1]='o';
//		name[2]='h';
//		name[3]='n';
		//name -> john 문자로 저장 / 문자열은 배열로 만들어짐.
		// 문자열은 배열이지만 char배열로는 온전한 문자열 입력이 어렵다.
		// 배열이기 때문에 인덱스를 통해 문자 하나씩 입력,저장해야한다.
		// 그래서 자바에서는 문자열의 사용을 편하게 하기 위해 
		// String클래스가 존재한다.
		// String 클래스에는 내부적으로 char 배열 생성되도록 되어있다.
		
//		System.out.println(a);  //주소가 나옴
//		System.out.println(name);
//		System.out.println("member"); // |m|e|m|b|e|r|로 저장됨.
//		System.out.println("member".length());
//		
//		String myName="john";
//		System.out.println(myName);
//		myName="설경구";
//		System.out.println(myName.charAt(0));
//		
//		String youName = new String("박문수"); // class이기때문에 객체를 만들어서 사용 //String myName="john";이렇게 해도됨.
//		System.out.println(youName);
		
//		int[]a=new int[] {11,20,55};
//		int[]b=new int[] {13,20,55};
//		
//		boolean isSame = true; // 같은배열이면 true 다르면 false >> 내가 정해줘야함.
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i] != b[i])  // 반복문이라 else를 쓰지 않음. 
//				isSame=false;
//			}
//			if(isSame) {
//				System.out.println("같은 배열");
//			}else {
//				System.out.println("다른 배열");
//			}
//		
		
		
//		char[] name1 = new char[] {'주','동','건'};
//		char[] name2 = new char[] {'장','동','건'};
//		
//		boolean isSame = true;
//		
//		for(int i=0;i<name1.length;i++) {
//			if(name1[i]!=name2[i]) 
//				isSame=false;
//			
//		}
//		if(isSame) {
//			System.out.println("같은이름");
//		}else {
//			System.out.println("다른이름");
//		}
//		
		
	
		String name1 = "주동건";
		String name2 = "이동건";
		if(name1.equals(name2)) // if()안에 들어올수있는 식은 참이냐 거짓이냐만 들어올 수 있음 name1=="아하"이런거 xx
			System.out.println("같은이름");  // equals안에 for(int i=0;i<name1.length;i++) {
//		if(name1[i]!=name2[i]) 
//		isSame=false;  이런과정이 담겨있다. 하나씩 비교하는거
		else
			System.out.println("다른이름");
		
		System.out.println(name1.compareTo(name2)); // name1과name2가 완전같다면 숫자는 0이나온다. 음수냐,양수냐에 따라 정렬가능
		// compareTo : 0이라면 두 문자열 동일
//				 양수 : 사전적 순서가 앞일 경우 // name1이 ㅈ이고 name2가 ㅇ이면 ㅇ이먼저니까  
//				 음수 : 사전적 순서가 뒤인 경우 
		
		// 오늘 과제가 있어요
		// 랜덤범위 1~50
		// 랜덤숫자중에서 짝수 15개를 배열에 저장
		// 15개 전부 저장되면 배열 출력하시오
		// 숫자중복상관없음
		

//		int[]total=new int[10];
//		int[]a=new int[] {10,20,30,40,50};
//		int[]b=new int[] {55,44,33,22,11};
		
		// -------for문 2개로 만들기------------
//		for(int i=0;i<a.length;i++) {
//			total[i]=a[i]; // total[0]=a[0], total[1]=a[1].....
//		}
//		
//		for(int i=0;i<b.length;i++) {
//			total[i+5]=b[i];	//total[5]=b[0], total[6]=b[1]....
//			System.out.println(total[i]);
//			
//		}
		
		//---------for문 1개로 만들기-----------
//		for(int i=0;i<a.length;i++) {
//			total[i]=a[i];
//			total[i+5]=b[i];		
//		}
//		for(int i=0;i<total.length;i++) {
//			System.out.println(total[i]);
//		}
//		
		
		
		int[] a = new int[15];
		int[] b = new int[15];
		
		int num = (int)(Math.random()*50+1);
		
		for(int i=0;i<a.length;i++) {
			if(num%2==0)
			a[i] = num;
			System.out.println(a[i]);
		}
		
		
		
		
		
//		int[] num = new int[] {10,20,30,40,50,60,70,80,90,100};
//		
//		for(int a : num) {
//			System.out.println(a); // 인덱스 없이 값만 빠르게 빼오겠다. // 출력할때만 사용(인덱스가 없기때문에)
//		}
//		
//		

		
	}
		
		
	}


