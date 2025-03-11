package Control;

import java.util.HashMap;
import java.util.Scanner;

import Service.ActiveService;
import Service.MemberService;
import Service.SchoolService;

public class MyMain {
	private static Scanner sc = new Scanner(System.in);
//			 ┌main에서 menu사용하려면 static메서드에서는 인스턴스메서드 사용불가라서 
	private static int menu() {
		
		System.out.println("\n\n============메뉴===========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	public static int subMenu(SchoolService schoolService, String id) {
		
		System.out.println("\n===== 아이러브스쿨 =====\n");
		System.out.println("1. 학교찾기");
		System.out.println("2. 동창회");
		System.out.println("3. 소모임");
		System.out.println("4. 종료");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		if(num==1) {
			schoolService.searchSchool(id);
		}else if(num==2) {
			schoolService.myReuion();
		}else if(num==3) {
			schoolService.smallGather();
		}else {
			return 0;
		}
		return subMenu(schoolService,id); // 재귀호출 return0이 동작해야 반복끝남.(반복문 생각하기)
			
	}
	public static void main(String[] args) {
		// 서비스 클래스들을 통해 로그인과 학교 찾기를 할것이다.
		MemberService memberService = new MemberService();
		SchoolService schoolService = new SchoolService();
		
		//메뉴
		while(true) {
//					┌꼭 변수만 들어오지 않고 return되는 메소드자체를 넣어도됨.		
			switch(menu()) {
				case 1: // 로그인
					String id=memberService.signIn();
					if(id != null) { // 로그인 성공 null이 아닌경우
						subMenu(schoolService, id);
						return;
					}else // 로그인 실패
						System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
					break;
				case 2: // 회원가입
					memberService.signUp();
					break;
				case 3: // 종료
					return;
				default:
					System.out.println("잘못 선택했습니다.");
			}
		}

	}

}


/*
	5!을 구하는 메서드
	
	int fac(int a){
		if(a==1) return 1;
		return a * fac(a-1);
	}
	
	fac(5);		//1번째 메서드
		a -> 5
		return 5 * fac(5-1);
		
		fac(4) // 2번째 메서드
			a -> 4
			return 4 * fac(4-1);
			
			fac(3) // 3번째 메서드
				a -> 3
				return 3 * fac(3-1); // 4번쨰
				 	a -> 2
				 	return 2 * fac(2-1); // 5번째
				 	a -> 1
				 	return 1;



	float aa(int b){
		
		if(b>5)
			aa(b-1);
		return b/2.0;
	}
	
	aa(6); > aa실행 aa(6-1); b=5 > return 5/2.0=2.5반환
	
	int i = 7;
	for(; i>5; i--);
	
	// 1부터 5까지의 합을 구하는 반복문
	int sum=0;
	for(int i=1; i<=5; i++){
		sum= sum+i; 1+2+3+4+5
	}
	System.out.println(sum);
	
	// 메서드로 만들기
	int sum(int a){
		if(a==1) return 1;
		return a + sum(a-1); // 매개변수를 받고실행 > 5부터 시작하니까 5+4+3+2+1이 되게
	}
	
	
	System.out.println(sum(5));

*/
