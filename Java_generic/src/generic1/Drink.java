package generic1;

public class Drink<T> {
	T name;
	int ml;
	
	public void 경림추천(T name) {
		this.name=name;
		System.out.println(this.name);
	}
}
