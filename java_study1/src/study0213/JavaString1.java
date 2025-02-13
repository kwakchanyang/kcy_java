package study0213;

import java.util.Scanner;

public class JavaString1 {

	public static void main(String[] args) {
		
		String title="자바는 즐거워";
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("제목 입력 :");
//		title = scan.nextLine(); // .next();
		
		System.out.println(title);
		
		System.out.print("이름 :");
		String name = scan.nextLine();
		
		System.out.print("나이 :");
		int age = scan.nextInt();
		
//		scan.nextLine();   // 엔터값이 있어야 이를 쓸 수 있어서 엔터를 넣어준다. > nextLine을 나중에 쓸 수 있음.
		
		
		System.out.println(age+" "+name);
		
//		nextLine으로 문자열 입력받기 전에 다른것 입력받는것이 있으면 안됨!! > 가장 먼저 나와야함. 왜 숫자가 먼저나오니까 안되었나? 20입력하고 엔터(정수로볍환x)를 쳤기 때문에
//		nextLine를 쓰면 입력버퍼안에 이미 엔터가 들어가있어서 입력이끝남 > 얘를 이제 ram으로 보냄. > 이름을 출력못하고 나이의 값이 그대로 있게 되는것
//		키보드로 입력된값이 정수로 변환이 되야함. 2p입력하면 오류남(변환이 안됨) 
		
//		next()는 엔터입력시 엔터 입력 되기 전에 입력한 버퍼에 쌓여있는 값을 가져온다.=엔터미포함 >> 버퍼에 엔터가 남겨놓고옴.
//		nextLine()는 버퍼에 엔터가 있어야 버퍼의 값을 가져온다.=엔터포함  >> 모든 문자한줄을 다 통째로 가져오려면 얘를 써야함.
		
//		파일 불러오기(읽기)하면 버퍼의 영향을 받을 수도 있다.
//		next()를 이용해서 문자열 입력받는 것이 무조건 답은 아니다.
//		필요에 의해서는 nextLine을 통해 문자열 입력받도록 해야한다.
		
	}

}
