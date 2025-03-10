package collection7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MainMt {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("수박", 15000); map.put("바나나",5400);
		map.put("앵두", 2300);	map.put("딸기", 12400);
		
		System.out.println(map);
		
		map.put("수박", 19000);
		System.out.println(map);
		
		if(map.containsKey("수박")) {
			System.out.println("key로 수박이 사용중");
		}
		// 포함여부는 contains인데 key, value 각각 있다.
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.get("앵두"));
		System.out.println(map.get("참외"));
		
		// 맵에 저장되어있는 특정 key의 value변경
		map.put("앵두", 3100);
		System.out.println(map);
		
		map.replace("앵두",4300);
		System.out.println(map);
		// put 메서드는 새로운 값 저장 또는 변경 > 얘를 쓰면 변경인지 추가인지 구분못함 > 이미있는값이 변경될수있으니 새로운걸 생성할때 put쓰기
		// replace 메서드는 이미저장된값 변경
		map.put("토마토", 5600);
		System.out.println(map);
		
		map.put("구아바", 9800);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println(map.entrySet()); 
		
		for( Entry<String, Integer> ent : map.entrySet()) {// entrySet을 해야 key와 value를 따로 꺼내올수있음
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		HashMap<String, Active> cmd = new HashMap<>();
		cmd.put("회원가입", new Member());
		cmd.put("게시판", new Board());
		cmd.put("게임", new Game());
		
//		cmd.get("게시판").board클래스 메서드 실행();
//		cmd.get("게시판").save();등등 필요한메서드 만들어서 사용
		cmd.get("게시판").save();
		cmd.get("회원가입").save();
		cmd.get("게임").save();
		
		String command = "게시판"; // 여기만 변경하면 가능
		
		Active action = cmd.get(command);
		action.save();
		
		
		
		
		
	}

}


/*
	Map - key와 value로 이루어진 구조
		  key는 중복불가, value는 중복가능
		  조회방법은 key를 통해 value찾기
		  
		  HashMap, TreeMap 
		  
	



*/