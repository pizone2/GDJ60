package com.iu.s4.objects3.p1;

public class Member {
	
	//비만관리 회원등록
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public Member() {}
	public Member(int age) {
		if(age > 0 || age < 200) {
			this.age = age;
		}
	}
//	==========================================================
	//setter 메서드
	//set + 변수명의 첫글자를 대문자로 바꾼것.
//	public void setAge(int age) {
//		if(age > 0 && age < 200) {
//			this.age = age;
//		}
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setKi(int ki) {
//		this.ki =ki;
//	}
//	public void setMuge(int muge) {
//		this.muge = muge;
//	}
//	//getter 메서드
//	//set + 변수명의 첫글자를 대문자로 바꾼것.
//	public int getAge() {
//		return this.age;
//	}
//	public String getName() {
//		return this.name;
//	}
//	public double getKi() {
//		return this.ki;
//	}
//	public double getMuge() {
//		return this.muge;
//	}
//	=====================================================
	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Ki : "+this.ki);
		System.out.println("Muge : "+this.muge);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getKi() {
		return ki;
	}
	public void setKi(double ki) {
		this.ki = ki;
	}
	public double getMuge() {
		return muge;
	}
	public void setMuge(double muge) {
		this.muge = muge;
	}

}
