package com.iu.s2.loops;

import java.util.Scanner;

public class LoopFor1_ex2 {

	public static void main(String[] args) {
		
//		Scanner sc =new Scanner(System.in);
			//학생수를 입력 받고
			//학생수 만큼 점수를 입력 받아서
			//총합계를 출력
//		System.out.println("학생수를 입력하세요.");
//		int count = sc.nextInt();
//		
//		int sum = 0;
//		
//		for(int i=1;i<=count;i++) {
//			System.out.println("수학점수를 입력하세요.");
//			int math=sc.nextInt();
//			sum = sum+math;
//			System.out.println("총"+i+"명의 합계는 "+sum+"점");
//			
			
//		}
		
		System.out.println("초를 입력하세요.");  //5입력
		Scanner sc = new Scanner(System.in);
		int cho = sc.nextInt();
		
		for(int i=0;i<60;i++) {    //수정금지
			System.out.println(i+"초");     //1.2.3.4.5 찍고 아웃
			if(i==cho) {
				i=60;
			}
		}
		
		
		System.out.println("종료");
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
