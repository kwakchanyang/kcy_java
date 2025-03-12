package chat;
import java.util.ArrayList;

public class User implements Chatting{
	private ArrayList<ChatContext>	ChatLog = null;
	
	 static String sentMsg; // 상위에서 static 클래스를 만들어줘서 sentMsg를 sendMessage도 receiveMessage에도 sentMsg를 쓸수있는것임 > 둘다 저장될수있음.
	
	public class ChatContext {
	String context;
	
		private ChatContext(String _context) { // 생성자 - 생성될때 실행 > 초기화해줌.
			this.context = _context;
		}
	}
//	  ┌클래스 외부에서 접근 가능
	public User() { // 생성자 메서드 > User객체가 생성될때 호출되며, 객체의 초기상태를 설정
		ChatLog = new ArrayList<>(); // ChatLog라는 변수를 ArrayList의 새로운 인스턴스로 초기화 (채팅기록저장역할)
	}
	
	@Override
	public void sendMessage(String msg) {
		System.out.println("보낼 메세지 :"+msg);
		ChatLog.add(new ChatContext(msg));
		sentMsg = msg; // 메서드 밖으로 나가면 초기화null이 된다.
		System.out.println("전송완료");
	}

	@Override
	public void receiveMessage() { // 인터페이스와 똑같이 매개변수까지 - 오버라이딩이라서
		System.out.println("받은 메세지: "+sentMsg);
		ChatLog.add(new ChatContext(sentMsg)); // 메세지를 저장
		System.out.println("수신완료");
	}
	
	public void printLog() {
		for(ChatContext c : ChatLog) {
			System.out.println(c.context);
		}
	}

}


/*
	인스턴스
	클래스는 객체의 설계도 / 인스턴스는 설계도를 바탕으로 메모리에 생성된 실제 객체 > 이 객체는 클래스의 속성과 메서드를 가진다.
	변수
	데이터를 저장할 수 있는 메모리공간의 이름
	



*/
