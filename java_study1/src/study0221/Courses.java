package study0221;

public class Courses {
	//수강과목
	int cNo; // 과목번호
	String cName; //과목명
	int times; // 시수
	int point; // 학점
	
	Courses(){}
	Courses(int cNo, String cName, int times){
		this.cName=cName;
		this.cNo=cNo;
		this.times=times;
		this.point=times; // 시수에 따라 학점 부여?
	}
	
	public String toString() {
		return this.cNo+" 과목명 : "+this.cName+" 시수 : "+
				this.times+" 학점 : "+this.point;
	}
}
