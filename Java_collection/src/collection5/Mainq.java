package collection5;

import java.util.LinkedList;
import java.util.Queue;

public class Mainq {

	public static void main(String[] args) {
		
		// FIFO 구조 - First In First Out (그냥통처럼생김)  들어오고 -> 〓 -> 나감 
		// ex)키보드 입력생각 - 먼저실행된걸 실행하라
		
		Queue<Integer> q = new LinkedList<>();
		
		q.offer(100);
		q.offer(20);
		q.offer(343);
		
		System.out.println(q);
		// 큐에서 내보내기 - 먼저 들어온 순서대로
		q.poll();
		System.out.println(q); // 먼저 들어온 순서대로 삭제 
		
		
		

	}

}
