package com.ssafy.hw06;

public class UserTest {
	public static void main(String[] args) {
		
		UserManager um = new UserManager();
		
		//유저들은 이래요~
		User u1 = new User("dkdlel4805", "qwerty", "정민아", "als4805@naver.com", 22);
		User u2 = new User("abc4805", "54321", "김똘망", "didi@naver.com", 34);
		VipUser vu1 = new VipUser("qmdkvl3828", "seije", "이메롱", "apfhd@naver.com", 28, "다이아", 3948380);
		VipUser vu2 = new VipUser("gpgp333", "qlalf", "최비밀", "qlalf@naver.com", 30, "루비", 5000);
		
		//유저들을 추가
		um.add(u1);
		um.add(u2);
		um.add(vu1);
		um.add(vu2);
		
		//출력
		System.out.println(um.getList());
		System.out.println(um.getUsers());
		System.out.println(um.getVipUsers());
		System.out.println(um.searchByName("롱"));
		System.out.println(um.getAgeAvg());
	}

}
