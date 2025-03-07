package collection4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Node {
	private int num; // 데이터
	private Node link; // 다음 노드 주소
	
	public Node(int num) {
		this.num=num;
	}
}
