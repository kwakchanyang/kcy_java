package study0206;

import java.util.Scanner;

public class test0206 {

	public static void main(String[] args) {
		// 베스킨라빈스 31게임 
		//무한루프+반복문+if문은 31이 나오면 끝나야함 몇개입력하고 그만큼만 숫자가 나오게하기
	    /*오늘 의 과제  
	     베스킨라빈스 31 게임 만들기
	     나와 컴퓨터 둘이서 진행 
	     31을 제시하는 쪽이 패배 
	     나 부터 시작 한다. 
	     숫자 몇개를 제시할것인지 갯수를 입력하면 자동으로 숫자가 나온다.
	     컴퓨터는 랜덤을 이용해서 몇개 제시할것인지 해야한다.
	     숫자는 1개 부터 3개까지 가능
	     
			예시)
			나 - 몇개 ? 2
			나 : 1  2  
			컴 : 3  
			나 - 몇개 ? 1
			나 : 4  
			컴 : 5  6  7  
			나 - 몇개 ? 3
			나 : 8  9  10  
			컴 : 11  12  
			나 - 몇개 ? 3
				*/
		Scanner sc = new Scanner(System.in);
		
		int me=0, com=0,num=1;// 1부터 시작이니까 num=1해주기 // while문 밖에서 변수를 초기화 해주기
		
		while(true) { // 언제 31이 나올지 모르니 무한루프로 전체를 반복
			System.out.println("\n숫자 몇개:");
			me = sc.nextInt();
			// 1~3 사이 값입력했는지 체크하는 반복문 만들면 좋겠지요
			System.out.println("나:");
			for(int i=1; i<=me;i++) {
				System.out.print((num++)+" "); //얘를 그냥 출력하면 1만 반복해서 나옴 그래서 num++을 해준다 ==>출력한 다음에 1증가한다. 
				// 코드 한문장식 출력해보면서 진행하기(어떻게 나오는지 살피면서)
				if(num==32) break; // for문 종료
			}
			if(num==32) {
				System.out.println("내가 졌다...");
				break;//while종료	
			}
			com = (int)(Math.random()*3+1); // 컴퓨터도 1~3개 중 하나 고름
			System.out.println("\n컴퓨터: "); 
			for(int i=1;i<=com; i++) {
				System.out.print((num++)+" ");
				if(num==32) break;
				
			}if(num==32) {
				System.out.println("컴퓨터 패배!!");
				break; //while문 종료
			}
			} // 코드 작성해보고 중복되는 부분은 하나로 합쳐서 표현하는 것이 좋음!!
			
	}

	}



