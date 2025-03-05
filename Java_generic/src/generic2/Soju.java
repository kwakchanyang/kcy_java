package generic2;

public class Soju extends Alcohol{
	
	public Soju(String name,String cmp,int abv) {
		super(name,cmp,abv);
	}
	
	
	@Override // toString은 최상위 객체 오브젝트가 가짐
	public String toString() {
		return "소주 : "+cmp+", "+name
				+", 도수 :"+abv+"%";
	}
	
	
}
