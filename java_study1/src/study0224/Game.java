package study0224;

public class Game {
	String title;
	int cnt; // private를 붙이면 내부에서만 사용할수있는 변수가됨.
	
	Game(){} // 게임앞에 default가 붙어있음
	Game(String title, int cnt){
		this.title=title;
		this.cnt=cnt;
	}
}
