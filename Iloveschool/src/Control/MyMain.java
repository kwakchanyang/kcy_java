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
	public static void main(String[] args) {
		// 서비스 클래스들을 통해 로그인과 학교 찾기를 할것이다.
		MemberService memberService = new MemberService();
		SchoolService schoolService = new SchoolService();
		
		//메뉴
		while(true) {
//					┌꼭 변수만 들어오지 않고 return되는 메소드자체를 넣어도됨.		
			switch(menu()) {
				case 1: // 로그인
					memberService.signIn();
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
