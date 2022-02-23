package com.ssafy.hw06;

import java.util.Arrays;

import com.ssafy.hw06.User;

public class UserTest {
	public static void main(String[] args) {
		User u = new User("Sohyun", "abcdefg", "김소현", "abcd@gmail.com", 29);
		User u2 = new User("Minju", "hijklm", "김민주", "efgh@gmail.com", 22);
		VipUser vu = new VipUser("Yeji", "yejizzang", "정예지", "yeji@gmail.com", 23, "VIP", 200);
		VipUser vu2 = new VipUser("Yujin", "yujini", "박유진", "yujin@naver.com", 20, "VIP", 220);

		UserManager um = new UserManager();

		um.add(u);
		um.add(u2);
		um.add(vu);
		um.add(vu2);
		
		System.out.println(Arrays.toString(um.getList()));
		System.out.println(Arrays.toString(um.getUsers()));
		System.out.println(Arrays.toString(um.getVipUsers()));
		for (User tmp : um.searchByName("김")) {
			System.out.println(tmp);
		}
		System.out.println(um.getAgeAvg());


	}
}
