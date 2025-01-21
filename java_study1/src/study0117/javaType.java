package study0117;

public class javaType {

	public static void main(String[] args) {
		int num = 20;
		float pi=3.14f;
		
//		num = pi; //범위가 큰애를 작은쪽에 넣을 수 없지만 방법이 있음 >> 크기를 변경(범위가 큰 애의 type을 변경시킨다)
//		변환은 같은 타입(숫자-숫자)끼리 하는 것임!
		num = (int)pi; //강제형 변환( 큰쪽이 다른쪽으로 들어갈때) - 일시적 타입 변환
//		char ch = (char)pi; >>> 취급하는 데이터종류가 다르기 때문에 얘는 문자-숫자는 안됨.
		pi=num; // 자동형 변환 (작은쪽이 큰쪽으로 들어갈때)
		System.out.println(pi);
		
	}

}
