package testMain;

public class Circle extends Diagram{
	
	public Circle(int w,int h) {
		super(w,h);
	}
	
	@Override
	public void draw() {
		System.out.println("지름이"+width+"인 원을 그린다.");	
	}
}
