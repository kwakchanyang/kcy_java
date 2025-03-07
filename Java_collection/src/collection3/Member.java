package collection3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter // 자동호출
@Setter // 자동저장
@ToString // 밑의 모든변수 다 출력됨
@NoArgsConstructor // 기본 생성자 메서드
@AllArgsConstructor // 모든인스턴스를 매개변수로 메서드
//@EqualsAndHashCode // equals와 HashCode를 사용가능 >> 얘는 밑의 변수들기준으로 다 비교 > 맞춤형아님(개발자가직접만들어야함)


// compareTo(T o) equals(Object obj)는 타입자체가 Object라서 형변환을 해줘야 했지만
// 얘는 타입을 Object로 받아오지 않으니까 아예 Member을 바로 받기
// 추상메서드 public compareTo(T o)가 추상메서드라서 얘를 가져온 클래스인 comparable도
// 추상클래스가 된다 > 추상메서드를 만들어야한다.

public class Member implements Comparable<Member>{
	private Long id; // 회원 번호
	private String memberId; // 회원 아이디
	private String email; // 회원 이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	private int age; //나이
	
	
	// 컬렉션에서 contains, indexOf와 같은 비교하는 동작 메서드
	// 사용하려면 사용자정의 클래스에는 equals를 구현해야 한다. 
	
//	@Override 최상위 Object가 가지는 toString을 상속받아서 사용하는것이기 때문에 
// 오버라이딩 조건 : 제어자부터 매개변수(타입은 똑같아야 하고 변수이름은 바뀔수 있음 > 타입이 중요함)까지 모두 똑같이 적어야함 but 메소드안의 내용은 달라질수있음
	

	
//	public Member() {}
//	public Member(Long id, String memberId,String password,
//			String email,String birth) {
//		this.id=id;
//		this.memberId=memberId;
//		this.password=password;
//		this.email=email;
//		this.birth=birth;
//	}
	@Override                // ┌Member클래스 객체 대상이 들어옴
	public boolean equals(Object obj) { //obj의 타입이 Object인데 얘는 email없음 Member에 있음
		
		Member temp = (Member)obj; // Memebr타입으로 obj를 강제형변환
		boolean isSame = this.birth.equals(temp.birth); // equasl의 반환타입이 boolean이라서 얘씀
		isSame = isSame && (this.email.equals(temp.email));
		isSame = isSame && (this.memberId.equals(temp.memberId));
		
		return isSame;

		
	
	}


	@Override // int인 이유? 음수,양수,0중에서...
	//ArrayList에 담긴 member객체가 실행시킴
	// 첫번째애가 메소드를 실행시키고 두번째애가 매개변수로 들어온다.
	public int compareTo(Member o) {
		// 정렬을 위한 compareTo메서드 구현
		// 객체 자체를 정렬시키는것이 아니라 정렬기준을 정해야 한다.		
		//                 	┌String클래스에 이미 compareTo가 있어서 가져다쓰기
		return this.birth.compareTo(o.birth);
//		return o.birth.compareTo(this.birth); 자리바꾸거나
//		return this.birth.compareTo(o.birth) * -1; 곱하기 -1해주기
		
//	 	return this.age - o.age; > 숫자는 그냥 빼기해주기
	}


}


// 클래스 정의
// 인스턴스변수의 접근제어자는 private
// 인스턴스변수에대해 get,set 메서드
// toString 메서드 만들기