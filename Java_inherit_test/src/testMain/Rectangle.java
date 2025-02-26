package testMain;

public class Rectangle extends Diagram{
	
	public Rectangle(int w,int h) {
		super(w,h);
	}
	public void draw() {
		System.out.println("밑변"+width+"높이"+height+"인 삼각형 그리기");
	}
}
