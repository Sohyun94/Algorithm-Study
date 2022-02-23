package com.ssafy.hw06;

public class VipUser extends User {
	
	private String grade;
	private int point;
	
	
	//기본생성자
	public VipUser() {
		
	}
	
	//생성자
	public VipUser(String id, String password, String name, String email, int age, String grade, int point) {
		super(id, password, name, email, age);
		this.grade = grade;
		this.point = point;
	}

	//getter, setter
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return getId() + " 회원의 등급은 " + getGrade() + "이고, 포인트는 " + getPoint() + "점 있습니다.";
	}

}
