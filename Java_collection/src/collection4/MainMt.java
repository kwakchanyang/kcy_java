package collection4;

public class MainMt {

	public static void main(String[] args) {
		
		// 배열이 가지는 장점 : 공간이 연속적으로 되어있다. > 데이터 빠르게 저장,꺼내오기      10□30□50□7□
		//            단점 : 만약 50을 삭제한다면? 10□30□ □7□  > 연속성이 사라져서 느려짐 > 빈공간이 없도록 뒤쪽꺼를 땡겨옴 > 
		// 					100개라면? 97번은 땡겨야함 > 개수가 더 많다면? > 데이터를 추가로 저장한다면? 한칸씩 밀어야함 > 시간이오래걸림(배열의크기가 클수록)
		// >>> 링크드리스트 > 메모리주소가 여기저기 연결되어있는구조 > 자기 다음에 누구일지 알고있음.
		// 참조변수 - 클래스,인터페이스타입으로 만들어진애들 > 메무리주소저장됨.
		
		// 맨앞에 있는 노드 = head 맨마지막노드 = tail 
		
		LinkList list = new LinkList();
		
		list.add(10);
		list.add(40); 
		list.add(50);
		list.add(14);
		list.add(52);
		list.view();
		
	}

}
