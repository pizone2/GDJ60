package com.iu.s4.objects2;

public class Monster {
	//맴버변수 , instance 변수
	int power;
	int hp;
	
	//생성자 Constructor
	public Monster() {
		//매개변수가 없는 생성자를 기본 생성자,default Constructor
		this.power = 50;
		this.hp =60; 
		System.out.println("생성자 실행");
	}
	
	public Monster(int power) {
		
	}
	
	//멤버메서드,instance method
	//공격
	public boolean checkValue(Monster monster) {
		//나의 power와 같고, 나의 HP가 같다면 true 리턴, false리턴
		
		if(this.power==monster.power&&this.hp==monster.hp) {
			return true;
		}
		return false;
	}
	
	//어슬렁
	public void info() {
		System.out.println(this);
		//참조변수 this : class내에서만 사용 가능,생성된 객체주소를 담음
		System.out.println(this.power);
		//this는 생략가능
		System.out.println(hp);
		
		attack();
	}
	
	public void attack() {
		System.out.println("공격합니다.");
	}
	public void setHP(int hp) {
		this.hp = hp;
	}
	

}
