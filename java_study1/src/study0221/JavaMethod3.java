package study0221;

public class JavaMethod3 {
//								┌배열전체가 필요하니까 얘를 가져와야함 // 얘가 가지고있는 주소를 arr에 넘겨줌(그래야 접근가능)
	static void findSubject(Courses[] arr) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i].point ==2) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
//			┌ 변수앞은 다 타입임		┌얘는 그냥 배열공간을 만든것임
		Courses[] course = new Courses[] { //class로 만들어진 배열은 참조변수임 > 그래서 new로 진짜 공간을 만들어야함
//				진짜 데이터공간은 이렇게 new 와 ()안에 데이터가 들어가야함
				new Courses(1, "정보사회와 컴퓨터",3),
				new Courses(2, "데이터베이스",3),
				new Courses(3, "자료구조",3),
				new Courses(4, "java",3),
				new Courses(5, "html",2)
				// Courses□ <- □□□□□ <- 1□정보사회□3□ 2□데이터□3□ 3□자료구조□3□ 
		};
		
		findSubject(course);
		
		// 학점이 2학점인 과목을 찾아라!! - 메서드
		// 메서드 내용 course배열을 반복문으로 돌려서
		// point가 2인거 찾기위한 if문
		// 그리고 찾았으면 그자리에서 출력할것인지(찾고출력까지) 아니면 반환할것인지(찾기만)(return한다면 void를 타입에 맞게 변경)
		// 내용이 동작하기 위해 필요한것!
		// - course배열이 필요 -> 매개변수(절차별로 진행하는 경우 매개변수통해)	
	}

}

// 매개변수(받아올것) void(내보낼것)을 생각하면 된다.
// 메서드안에 빨간줄이 뜬다면 받아와야되는것이다.
//메서드를 만들면 중복되는 것들을가져와서 쓰면되지만 메서드를 main에 
//쭉 다만들어놨다면 새로 다 만들어줘야함. >> 기능별로 메서드 다 나누기(코딩시간줄임)


/* 메서드 정의를 위한 메서드 원형작성법
 * 
 * 1. 메서드를 왜 만들어야 하지?
 * - 메서드 만들어서 어디에 사용하려고?
 * - 메서드 만들어서 머 하려고?
 * - 메서드 안 만들면 코드가 복잡해지나?
 * - 반복문으로 충분히 표현이 안되나??
 * 
 * 2. 메서드를 구현하면 내가 편하다!
 * - 처음에는 하나하나 메서드를 만들어야 해서 시간이 걸리지만
 * - 이후에는 이전에 만든 메서드를 사용하면 되서 시간이 단축된다.
 * - 그래서 메서드도 설계를 따로 해주기는 한다.
 * 
 * 3. 메서드에 필요한것을 제공 (매개변수)
 * - 여러개의 메서드는 서로 협력하여 일을 진행한다.
 * - 물양동이를 혼자서 200m 걸어가 옮기는것 보다
 * - 여러명이 한줄로 서서 전달 전달 전달 해서 옮기면 개개인이 덜 힘들다
 * - 최종 목적지까지 도달하기 위해 다음 사람에게 필요한것(양동이-매개변수)을 전달해준다.
 * 
 * 4. 다음 할일을 하기위해 필요한거 돌려받기(반환-return)
 * - 물을 담아서 양동이를 전달했다면 계속 일을 하기 위해
 * - 빈 양동이를 다시 받아와야 한다.
 * - 매개변수가 정방향으로 데이터를 제공하는 방법이라면
 * - 반환(return)은 역방향으로 데이터를 제공하는 방법이다.
 * 
 */




