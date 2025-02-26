package modifier;

public class User {
	
	public void view() {
		Microwave m = new Microwave();
		
		System.out.println(m.brand);
		// protected일때는 m.brand할수없음
		// public으로 바꿔주면 사용가능
		// 그러나 protected를 해주는게 좋다.
		// 그렇지만 brand를 노출시키는건 좋지않다??
	}
}
