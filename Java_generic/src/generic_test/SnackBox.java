package generic_test;

public class SnackBox<T> {
		T 과자;
		
		public void makeBox(T 과자봉지) {
			this.과자=과자봉지;
			System.out.println(this.과자);
			System.out.println("과자박스만들기");
		}
		
	
}
