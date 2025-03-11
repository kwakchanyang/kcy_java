package chat;

public interface Chatting {
	public void sendMessage(String msg); // 여기서 구현x 얘는 그냥 함수를 가질것이다 기능을 강제
	public void receiveMessage();
}
