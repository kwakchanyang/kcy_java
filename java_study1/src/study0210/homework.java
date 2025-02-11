package study0210;



public class homework {



	public static void main(String[] args) {

		// 오늘 과제가 있어요

		// 랜덤 범위 1 ~ 50 

		// 랜덤 숫자 중에서 짝수 15개를 배열에 저장 

		// 15개 전부 저장 되면 배열 출력 하시오 

		// 숫자 중복 상관 없음// 중복제거할때는??

		

	

		int[] arr=new int[15];

		int num=0;

	

		for(int i=0;i<arr.length;) {

			num=(int)(Math.random()*50+1);

			if(num%2==0) {

			arr[i]=num;

			i++;			

			}

					

		 }

		for(int i=0;i<arr.length;i++) {

			System.out.println("배열값:"+arr[i]);

		}

		

	}

}