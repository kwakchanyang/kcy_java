package exception6;

public class SearchException extends Exception{
	private String errorcode; // 예외(오류 코드번호)
	
	public SearchException(String message, String errorCode) {
		super(message);
		this.errorcode = errorCode;
	}
	
	
	// 검색에 관한 세부적인 메서드 만들기
	
	public void keywordMis() {
		System.out.println("검색어 잘못 입력");
	}
}
