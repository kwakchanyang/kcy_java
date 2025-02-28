package interface4;

public class MainMt {

	public static void main(String[] args) {
		
		RemoteCon[] remote = new RemoteCon[3];
		remote[0] = new Light();
		remote[1] = new Tv();
		remote[2] = new Aircon();
		
//		RemoteCon[] remote = new RemoteCon[] {
//				new Light(), new Tv(), new Aircon()
//		};
		
		for(RemoteCon con: remote) {
			con.power1();
			con.power2();
		}

	}

}
