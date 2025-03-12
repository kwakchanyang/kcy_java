package CustomerService;

import java.util.*;

public class Main {
	
	static InquiryManager inquiryManager = new InquiryManager();
	

	public static void printMenu() {
		/*
		 * 고객 메뉴 / 상담원 메뉴
		 * 고객 메뉴 -> 문의하기
		 * 상담원 메뉴 -> 상담원 문의 답변하기 -> 완료 
		 * 처리중 
		 *  
		 */
		System.out.println("====== 메뉴 ======");
		System.out.println("1. 문의하기");
		System.out.println("2. 상담원 메뉴");
		System.out.print("선택: ");
	}
	
	public static void printCustomerMenu() {
		//문의하기
		Inquiry i = getInquiryInput();
		System.out.println(i);
		inquiryManager.addInquiry(i);
		System.out.println("추가 완료");
	}
	
	public static void printAgentMenu() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("====== 상담원 메뉴 ======");
		System.out.println("1. 문의 처리");
		System.out.println("2. 문의 조회");
		System.out.println("3. 문의 삭제");
		
		
		int select = Integer.parseInt(sc.nextLine());
		// parseInt는 이 문자열을 정수로 변환하는 역할을 합니다. 
		//만약 사용자가 숫자를 입력했다면, parseInt는 그 숫자를 정수형으로 변환하고, 엔터키로 인한 줄바꿈 문자는 무시됩니다.
		int inqId = 0;
		
		switch(select) {
		case 1:
			//문의 처리
			System.out.print("처리할 문의 id: ");
			inqId = Integer.parseInt(sc.nextLine());
			
			System.out.println("처리 시작, 완료시 엔터");
			inquiryManager.updateInquiryState(inqId, 2); //처리중
			sc.nextLine();
			
			System.out.println("처리 완료");
			inquiryManager.updateInquiryState(inqId, 3);
			break;
		case 2:
			//문의 조희
			System.out.println("키워드 입력: ");
			String keyword = sc.next();
			ArrayList<Inquiry> list = inquiryManager.searchInquiry(keyword);
			if(list.size() == 0) {
				System.out.println("검색결과가 존재하지 않습니다.");
				break;
			}
			for(Inquiry iq : list) {
				System.out.println("문의번호: " + iq.getId() + "\n 제목: " + iq.getTitle() + "\n 내용: " + iq.getContext() + "\n 상태: " + iq.getState() + "\n 접수 날짜: " + iq.getRegisterTime());
			}
			break;
		case 3:
			//문의 삭제
			System.out.println("삭제할 문의 id 입력: ");
			inqId = Integer.parseInt(sc.nextLine());
			inquiryManager.deleteInquiry(inqId);
			System.out.println("삭제 완료");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
	
	public static Inquiry getInquiryInput() {
		Inquiry i = new Inquiry();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====== 데이터 입력 ======");
		System.out.print("문의 제목 입력: ");
		i.setTitle(sc.nextLine());
		System.out.print("내용 입력: ");
		i.setContext(sc.nextLine());
		System.out.print("고객 아이디: ");
		i.setCustomerInfo(sc.nextLine());
		System.out.print("문의 날짜: ");
		i.setRegisterTime(sc.nextLine());
		
		return i;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMenu();
			int select = Integer.parseInt(sc.nextLine());
			if(select == 1) {
				printCustomerMenu();
			}else if(select == 2) {
				printAgentMenu();
			} else {
				System.out.println("잘못된 입력입니다.");
			}				
		}

//		sc.close();
	}
}
