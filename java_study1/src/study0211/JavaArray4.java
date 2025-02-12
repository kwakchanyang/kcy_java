package study0211;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray4 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		int[] game = new int[25];
		
		// game배열에 값 채우기
		for(int i=0;i<game.length;i++)
			game[i] = (int)(Math.random()*50+1);
		
		//System.out.println(Arrays.toString(game));
		System.out.println("┌─┬─┬─┬─┬─┐");
		// 5줄 5칸 출력 
		// i=0이고 k=0,1,2,3,4,일때 0,1,2,3,4가 나와야 하고
		// i=1이고 k=0,1,2,3,4일때 5,6,7,8이 나와야하면 
		// 5*i+k를 해주면 된다.
		

		while(true) {
			// -------------빙고판 출력하는 코드-----------
			for(int i=0;i<=4;i++) { // 얘는 줄바꿔주는 용도
				for(int k=0;k<=4;k++) { // 옆으로 몇개를 출력할건가
					if(game[i*5+k] == 0)
						System.out.printf(" %2s ", "■");
					else
						System.out.printf(" %2d ", game[i*5+k]);
				}
				System.out.println();
			}
			
			//-----------숫자를 받아오겠다----------
			System.out.println("숫자 입력:");
			int num = scan.nextInt(); // 빙고판에 있는 숫자 입력
			
			for(int i=0;i<game.length;i++) {
				if(game[i] == num) { // 내가 입력한 숫자를 배열에서 찾기
					game[i]=0; // 내가 찾은 숫자를 0으로 표시
				}
			} /// 빙고가 안끝나고 있음 >> 빙고게임은 5줄 빙고되면 종료
				// 아직 무한루프 완성임 > 1줄~5줄빙고 체크할 수 있는 코드만들기
			// 0번인덱스부터  4까지 0이라면 한줄빙고 >> 가로,세로,대각선 다 따지기
			// 그림 그려서 보기 i,k잘 보기 (같은경우도 있음)
			// 중복제거하기
			// 여기까지 다했으면 컴퓨터와 같이하는 2인용 > 컴퓨터도 우리와같이 생각하도록
			// 빙고가 완성될 숫자를 선택하도록 ■ ■ 8 ■ 45 > 8이나45를 선택하도록
			
			// 몇줄이 빙고인지 출력
	
		
		
		
		
	}

}
}
