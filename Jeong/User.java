package com.ssafy.hw06;

public class User {

		//멤버변수
		private String id;
		private String password;
		private String name;
		private String email;
		private int age;

		//기본생성자
		public User() {
			
		}

		//생성자
		public User(String id, String password, String name, String email, int age) {
			this.id = id;
			this.password = password;
			this.name = name;
			this.email = email;
			this.age = age;
		}
		
		
		//getter, setter
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
		
		
		public String toString() {
			return "id : " + getId() + " password : " + getPassword() + " name : " + getName() + " email : " + getEmail() + " age : " + getAge();
		}
		
		

	


}
