package testMain;

public class Triangle extends Diagram{

//	Triangle(){super();}; // 자식에서 생기는 부모생성자는 기본생성자인데 부모쪽에
//	// 기본생성자인 public Diagram(){};이 없으면 오류가뜬다.
	
	public Triangle(int w, int h) {
		super(w,h);
	}
	
	@Override
	public void draw() {
		System.out.println("밑변"+width+"높이"+height+"인 삼각형 그리기");		
	}

}
