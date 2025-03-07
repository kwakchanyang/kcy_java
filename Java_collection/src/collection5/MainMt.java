package collection5;

import java.util.LinkedList;
import java.util.Stack;

public class MainMt {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>(); // ArrayList와 사용방법 똑같음
		list.add("틀린그림찾기");
		list.add("벽돌깨기");
		list.add("슈퍼마리오");
		
		list.contains("고인돌");
		list.indexOf("벽돌깨기"); // linkedlist는 index가 없는건데 자바에서는 사용가능하게 해놨음
//		System.out.println(list.get(1));
		
		// Arraylis데이터를 순차적으로 저장만 하고 그대로 꺼내올거다 / linkedlist 데이터를 중간중간 삭제,추가할때 사용(삭제가 빠름)
		// 스택  - FILO구조이다.First In Last Out
		// 웹 브라우저 히스토리, 계산기, 메서드 호출 등등
		// 들어오고 나가는곳이 한곳이라 동시에 출력,입력이 되지 않아 하나만 해야함.
		
		
		Stack<String> stack = new Stack<>();
		stack.add("김춘추");
		stack.push("이순신"); // stack만 가지고 있는 기능 push통해 데이터값 넣음
		stack.push("이성계");
		stack.push("홍길동");
		stack.push("김석진");
		stack.push("이정훈");
		stack.push("김미란");
		
		System.out.println(stack);
		
		stack.pop(); // 마지막에 들어간 김미란이 사라짐
		System.out.println(stack);
		
	}

}
