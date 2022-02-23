package com.ssafy.hw06.step2;

public class UserTest {
	public static void main(String[] args) {
		//객체 생성
		User u = new User("1", "123", "웅진", "ad@naver.com", 23);
		VipUser vu = new VipUser("2", "234", "진수", "da@naver.com", 24, "s", 223);
		
		UserManager um = new UserManager();//유저 관리자 생성
		
		//유저관리자에 u, vu 추가
		um.add(u);
		um.add(vu);
		
		//모든 userList 출력
		for(User tmp : um.getList()) 
			System.out.println(tmp);
		
		//나이변경
		vu.setAge(45);
		
		//vip유저 출력
		for(User tmp : um.getVipUsers())
			System.out.println(tmp);
		
		//이름찾기
		for(User tmp : um.searchByName("웅"))
				System.out.println(tmp);
		
	}
}
