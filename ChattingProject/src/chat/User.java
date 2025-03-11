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

	public User() {
		ChatLog = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String msg) {
		System.out.println("보낼 메세지 :"+msg);
		ChatLog.add(new ChatContext(msg));
		sentMsg = msg;
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
