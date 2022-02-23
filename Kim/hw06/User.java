package com.ssafy.hw06;

class User {
	// 필드 설정
	private String id;
	private String password;
	private String name;
	private String email;
	private int age;

	// 기본 생성자
	public User() {

	}

	// 생성자
	public User(String id, String password, String name, String email, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	// Getter, Setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [아이디 : " + id + ", 비밀번호 : " + password + ", 이름 : " + name + ", 이메일 : " + email + ", 나이 :" + age + "]";
	}

}
