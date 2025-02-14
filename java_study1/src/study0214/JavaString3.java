package study0214;

import java.util.Scanner;

public class JavaString3 {

	public static void main(String[] args) {
		
//		String str = "member"; // String str = new String("member");
//		System.out.println(str.charAt(0));
		
		
//		String str = new String("member");// ==String str = "member"  >> str에 바로 문자열이 담겨지는 것이 아님(그렇다면 배열의주소일텐데) 클래스타입으로 만들어진것은 객체의 주소만 저장함 
//		char[] c = new char[]{'a'};   // ==char[] c = {'a'};       타입[] => 배열의 주소를 가진다.
//		c[0] = 'a';   // 기본데이터타입들은 참조하는게 아니라 직접 값을 가짐. 
//		
//		String[] names = new String[5];
//		names[0] = new String("박문수");
//		names[1] = "김정호"; // 줄여서 사용해도됨..
//		names[2] = "서경림";
//		names[3] = "김명준";
//		names[4] = "이정훈";
//		
//		// 김미란 이름 등록 되어 있나??
//		
//		boolean hasName = false;
//		for(String name : names) {
//			if(name.equals("김미란"))
//				hasName=true;
//				
////			System.out.println(name);
//		}
//		
//		
//		// 문자열 메서드 중에??
//		// 방법1
//
//		// 방법2
//		String temp = String.join(",", names);
//		//박문수,김정호,서경림,김명준,이정훈
//		boolean hasName = temp.contains("서경림");
//		if(hasName)
//			System.out.println("이름 등록됨");
//		else
//			System.out.println("등록 되지 않은 이름");
		
		
		//학과명,조교,전화,위치
		String[][] dept = new String[4][];// [4][7]중복이 되어버림  [4][]==>중복방지
		dept[0]=new String[] {"컴퓨터공학과","정보과학과","정보통신공학과","정보산업공학과","전자공학과","문헌정보학과","전기공학과"};
		dept[1] = new String[] {"이지은","김영미","박순애","이춘애","이미선","김기범","박준용"};
		dept[2] = new String[] {"3333","3334","3335","3336","3337","3338","3339"};	
		dept[3] = new String[] {"T101","T201","T301","T401","T501","T601","T701"};
		
		//정보통신공학과의 과사무실 위치와 조교 이름은?
		String search = "정보통신공학과";
		
		int idx=-1;
		for(int k=0; k<dept[0].length;k++) {
				if(dept[0][k].equals(search)) {
					idx=k; break;
				}
			
		}
		if(idx==1) // 만약 학과가 존재하지 않으면
		{
			System.out.println("등록되지 않은 학과입니다.");
			return; // return은 메서드를 종료시킨다. main메서드 종료되면 프로그램 끝
		}
		
		System.out.println("조교 : "+dept[1][idx] + ",사무실 :" + dept[3][idx]);
		
		// 문제1.
//		학생 5명의 시험성적을 키보드를 통해 입력받고
//		평균점수를 구하여 출력하세요.
//		반드시 시험성적은 배열에 저장!!
//		int sum=0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.:");
//	
//		int[] student = new int[5];
//		for(int i=0;i<student.length;i++) {
//		student[i] = sc.nextInt();
//		sum=sum+student[i];
//		}
//		System.out.println("평균점수 : "+(double)sum/student.length);
		
		
//		int[] score = new int[5];
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int total=0,avg=0; //총합과 평균 변수
//		
//		for(int i=0; i<score.length;i++) {
//			System.out.println((i+1)+"번째 학생 성적 입력:");
//			score[i] = sc.nextInt();
//			total=total+score[i]; // 총점구학기
//		}
//		avg = total/score.length;
//		System.out.println("평균:"+avg);
//		
//		문제2.
//		알파벳 문자 하나를 입력하세요. 
//		입력한 알파벳으로 시작하는 단어를 모두 찾아 출력하세요.
		String[] word = new String[] {
				"apple", "banana", "cherry", "date", "elderberry", 
	            "fig", "grape", "honeydew", "kiwi", "lemon", 
	            "mango", "nectarine", "orange", "papaya", "quince", 
	            "raspberry", "strawberry", "tangerine", "ugli", "vanilla", 
	            "watermelon", "xigua", "yam", "zucchini", "avocado", 
	            "blueberry", "cantaloupe", "dragonfruit", "apricot", "blackberry", 
	            "coconut", "dragonfruit", "eggplant", "feijoa", "grapefruit", 
	            "huckleberry", "iceplant", "jackfruit", "kiwifruit", "lime", 
	            "mangosteen", "nectar", "orange", "peach", "pineapple", 
	            "pear", "plum", "pomegranate", "pear", "lime", 
	            "apricot", "banana", "papaya", "melon", "peach", 
	            "plum", "raspberry", "blueberry", "citrus", "mango", 
	            "blackcurrant", "cucumber", "fennel", "grape", "strawberry", 
	            "apricot", "blackberry", "currant", "kiwi", "orange", 
	            "lemon", "watermelon", "melon", "tangerine", "apple", 
	            "date", "elderberry", "fruit", "peach", "fruit", 
	            "apple", "cherry", "fig", "honeydew", "jackfruit", 
	            "papaya", "blueberry", "plum", "pomegranate", "grape", 
	            "avocado", "kiwi", "lemon", "watermelon", "tangerine", 
	            "strawberry", "dragonfruit", "lime", "pear", "peach"
		};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 : ");
		char alp = sc.nextLine().toLowerCase().charAt(0);
		
		//알파벳을 무조건 소문자로 변환
		
		int total = 0;
	
		for(String str: word) {
			if(str.charAt(0) ==alp ) {
				System.out.println(str); total++;
			}
		}
		
		System.out.println("총 단어 갯수 :"+total);
		}
	}



//	문제3
//	
//	영화관 예약사이트를 만드려고 한다.
//	영화관에 관별로 좌석수가 다르다.
//	3관의 좌석수는 96개(8줄12열)이다.
//	
//	좌석에 예약완료된 곳은 1로 표시
//	비어있는 좌석은 0으로 표시
//	
//	몇명 예약할 것인지 인원수를 입력하면
//	연속적으로 비어있는 자리로 지정해준다.(6명일경우 연속자리 없으면 -1나오게)
//	몇번째 좌석에 예약이 되었는지 출력(몇번재 인덱스인지)

// 01000111  =>3명예약할래 >> 01111111으로 바뀜 > 얘 인덱스는 [0,2][0,3][0,4]
// 01100000
// 00000100
	


// 참조변수 : 특정 공간의 메모리주소만 저장할 수 있는 변수
// 참조변수는 배열의 주소를 가지는 참조변수와, 객체의 주소를 가지는 참조변수 --> class타입으로 만들어 내는 것들은 객체임.
//  	   배열의 주소를 가지는 참조변수는  참조변수이름[인덱스]  방식
//		   객체의 주소를 가지는 참조변수는  참조변수이름.접근연산자(charAt()) 방식으로 사용
// int a=10;이런애들은 참조변수가 아님 / 참조변수는 데이터값을 직접가지는 것이 아니라 주소를 가짐.
// int[] 3 => int타입의 변수의 공간과 같다.