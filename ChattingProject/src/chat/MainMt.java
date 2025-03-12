package chat;

public class MainMt { // 채팅방 생각하기 내가 안녕보내면 상대방에도 안녕이 저장되어야 뜨지...??

	public static void main(String[] args) {
		
		User user1 = new User(); // 공간지정후 이름을 붙여야 사용한다.
		User user2 = new User(); // User클래스의 새로운 인스턴스를 생성하고, 이걸 user라는 변수에 할당
		user1.sendMessage("안녕");
		user2.receiveMessage();
		
		user2.sendMessage("ㅎㅇㅎㅇ");
		user1.receiveMessage();
//		
//		user1.printLog();
//		user2.printLog();
		
	}

}
