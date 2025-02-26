package testMain;

public abstract class Diagram { //부모
	protected int width;
	protected int height;
	
	public Diagram() {};
	
	public Diagram(int w,int h) {
		this.width=w;
		this.height=h;
	}
	public abstract void draw(); //추상메서드
}
