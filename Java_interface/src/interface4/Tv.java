package interface4;

public class Tv implements RemoteCon{

	@Override
	public void power1() {

			System.out.println("TV 전원켜짐");
			
		}

		
	@Override
	public void power2() {
	
		System.out.println("TV 전원꺼짐");
		
	}
}
