package interface4;

public class Light implements RemoteCon{

	@Override
	public void power1() {

			System.out.println("스마트전구 전원켜짐");
			
		}

		
	@Override
	public void power2() {
	
		System.out.println("스마트전구 전원꺼짐");
		
	}
	
}
