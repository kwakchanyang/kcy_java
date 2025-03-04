package inner2;

public class NoneName {
	
	// 인스턴스 내부클래스처럼 사용(익명 클래스)
	Object ob = new Object() {
		public int hashCode(int a) {
			return 10;
		}
	}; // 익명 클래스 정의와 메서드정의를 동시에 하면서 객체생성까지
}
