package Service;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.schoolDAO;
import VO.School;

public class SchoolService implements ActiveService{
	
	private schoolDAO dao;
	
	public SchoolService() {dao= new schoolDAO();};

	public void searchSchool(String id) {
		
		System.out.println("\n----- 나의 학교 찾기 -----");
		
		int schoolNum = search(); // 검색
		dao.saveData(id, schoolNum);// 등록 ( 데이터베이스 - 테이블에 저장 )
	}
	
//	private void saveData() {
//		// 테이블에 저장할것이다. 근데 여기에서 만들면 되나? 데이터베이스관련이니까 DAO에서 하기 
//		
//	}
//	private한 이유 searchSchool만 공개하고 search메서드는 굳이 공개안해도됨.
	private int search() {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색(지역, 유.초.중.고, 학교명) :");
		String searchWord = scan.nextLine();
		// 검색어를 데이터베이스에 조회하고 조회한 결과가 있다면 화면에 모두 출력
		// 검색결과가 몇개 있는지 모르고 모두 출력해야 하니까 ArrayList를 사용
		
		ArrayList<School> list = dao.searchSelect(searchWord);
		for(School school : list) {
			System.out.println(school.getId()+". "+
			school.getSchoolName()+" , "+school.getAddress());
		}
		
		System.out.println("내 학교 선택 : ");
		int num = scan.nextInt();
		
		
		return num;
	}

	public void myReuion() {
		
		System.out.println("나의 동창회 ~");
	}

	public void smallGather() {
		
		System.out.println("잉어킹 소모임~");
	}

}
