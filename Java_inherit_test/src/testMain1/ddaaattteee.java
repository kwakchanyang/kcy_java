package testMain1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ddaaattteee {

	public static void main(String[] args) throws ParseException {
		
		Date today = new Date();
		
		System.out.println(today);
		// 년도 출력
		System.out.println(today.getYear()+1900); //125나옴 기본이1990부터시작
		// 월 출력
		System.out.println(today.getMonth()+1);
		// 일 출력
		System.out.println(today.getDate());
		// 요일 출력
		System.out.println(today.getDay());
		// 시,분,초
		System.out.println(today.getHours()+":"+
		today.getMinutes()+":"+today.getSeconds());
		
		// 날짜와 시간 포맷 지정하는 방법
		// 2025.2.27
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		String myDate = sdf.format(today); // date객체(날짜)를 문자열로 할때는 format
		System.out.println(myDate);
		
		SimpleDateFormat time = new SimpleDateFormat("hh시 mm분 ss초");
		String myTime = time.format(today);
		System.out.println(myTime);
		
		// 날짜 차이 구하기
		// 2024.12.18부터 오늘까지 몇일인지 구하기
		// 문자열을 date객체로 바꾸는건 parse
		Date start = new SimpleDateFormat("yyy.MM.dd").parse("2024.12.18");
		
		// today가 2024년도보다 큰 숫자니까
		long difsec = (today.getTime() - start.getTime())/1000; // 초
		System.out.println(difsec);
		
		long difmin = difsec/60;
		System.out.println(difmin);
		
		long difhour = difmin/60;
		System.out.println(difhour);
		
		long difdays = difhour/24;
		System.out.println(difdays);
	}

}
