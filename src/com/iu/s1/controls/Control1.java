package com.iu.s1.controls;

public class Control1 {

	public static void main(String[] args) {
		//단일 if
		//if(조건식){ 조건식이  true일 때 실행}
		//졸업시험, 무조건 졸업,평균이 90점이상이면 우등상 수상
		System.out.println("프로그램 시작");
		double avg = 90.12;
		int don = 0;
		
		if(avg >= 90) {
				System.out.println("우등상 수상");
				don=1000000000;
			}
		System.out.println("장학금 : "+don);
		System.out.println("졸업을 축하 합니다.");
		System.out.println("프로그램 종료");
		

	}

}
