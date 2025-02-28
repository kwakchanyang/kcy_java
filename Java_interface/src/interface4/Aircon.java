package interface4;

public class Aircon implements RemoteCon{

	@Override
	public void power1() {

			System.out.println("에어컨 전원켜짐");
			
		}

		
	@Override
	public void power2() {
		System.out.println("에어컨 전원꺼짐");
	}
	

}
