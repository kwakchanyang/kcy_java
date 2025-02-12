package study0212;

import java.util.Scanner;

public class JavaArray7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][]board = new int[][] 
		{
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,2,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1} // 13줄 15칸
			
		}; // [13][15]
		int x=0,y=0;
		while(true) {
			for(int i=0;i<board.length;i++) {  // i의 최대는 12
				for(int k=0;k<board[i].length;k++) { // k의 최대는 14
					if(board[i][k] == 1)
						System.out.printf("■");
					if(board[i][k]==0) 
						System.out.printf(" ");
					if(board[i][k]==2) {
						System.out.printf("@");
						x =k; y=i;
					}
				}
				System.out.println(); // 줄바꿈
			} // 화면 그리기 반복문 끝
			
			// 이동 시키기 w,a,s,d
			System.out.println("방향 입력 : ");
			char key = input.nextLine().charAt(0); // 문자열은 배열임 |a|b|c|d|
			
			board[y][x]	=0; // 현재 위치에 0으로 변경 >> @없어짐
			switch(key) {
				case 'w' : // y축 감소 - 위로이동 >> 프로그래밍에서는 y축이 감소해야 위로이동하는 것
					if(board[y-1][x] !=1) y--; break; // 여기서 y-1은 그냥 계산만 한것이고 y--는 1을 감소하고 저장까지 한것임.>>y-1은 y값이 변하지 않음
				case 's' : // y축 증가 - 아래이동
					if(board[y+1][x] !=1)y++; break;
				case 'a' : // x축 감소 - 왼쪽이동
					if(board[y][x-1] !=1)x--; break;
				case 'd' : // x축 증가 - 오른쪽이동
					if(board[y][x+1] !=1)x++; break;
				default :
					System.out.println("잘못입력했습니다.");
					
			}
			board[y][x]=2; // 이동할 위치를 2로 변경
		}
	}

}
