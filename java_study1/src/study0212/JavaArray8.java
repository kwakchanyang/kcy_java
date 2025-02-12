package study0212;

import java.util.Arrays;

public class JavaArray8 {

	public static void main(String[] args) {
		
		int[][][] arr = new int[3][2][2];
		arr[0][0][0] = 10;
		arr[0][1][1] = 20;
		arr[0][1][0] = 30;
		arr[1][0][0] = 50;
		arr[1][0][1] = 60;
		arr[2][0][0] = 100;
		
		System.out.println(Arrays.toString(arr[0][0])); // 1차원일때는 배열이름만 써도 데이터가 나오지만 2차원이상은 인덱스까지 표현해줘야함.
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}

}
