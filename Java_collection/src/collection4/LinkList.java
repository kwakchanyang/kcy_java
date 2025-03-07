package collection4;

public class LinkList {
	private Node head;
	private Node tail;
	
	
	public void add(int data) {
		Node temp = new Node(data);
		
		if(head==null)
			head=temp; // 첫번째 node가 만들어질때는 head가 비어있는 상태임 첫번째를 계속 가져야함. 첫번째 일때만 이게 참임
		else { // 두번째 부터 마지막노드뒤에 다음노드의 주소가 들어가 있어야함 >  head가 아닌 tail을 통해 주소를 넣어야함
			tail.setLink(temp); // head 1□ tail 2□  >  1. 10□ link&2노드의주소(다음노드의주소)□  2. 40□ lilnk&3노드의 주소□
		}                                          // 마지막노드 데이터값□&null□
		tail=temp;
				
		}
		public void view() { // 링크드리스트 전체 출력
			Node move = head;
			while(move!=null) { // move가 null이면 끝남
				System.out.println(move);
				move = move.getLink();
				
			}
		}
	
}
