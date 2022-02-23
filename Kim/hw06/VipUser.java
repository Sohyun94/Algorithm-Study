package com.ssafy.hw06;

public class VipUser extends User {
	private String grade;
	private int point;
	
	public VipUser() {
	}

	public VipUser(String id, String password, String name, String email, int age, String grade, int point) {
		super(id, password, name, email, age);
		this.grade = grade;
		this.point = point;
	}

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

	@Override
	public String toString() {
		return "VipUser [아이디 : " + getId() + ", 비밀번호 : " + getPassword() + ", 이름 : " + getName() + ", 이메일 : " + getEmail() + ", 나이 : " + getAge() + ", 등급 : " + grade + ", 포인트 : " + point + "]";
	}

}
