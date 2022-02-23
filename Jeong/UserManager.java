package com.ssafy.hw06;

public class UserManager {
	
	private static final int MAX_SIZE = 100;
	private int size = 0;
	private User[] userList = new VipUser[MAX_SIZE];
	
	//사용자 추가
	public void add(User user) {
		if (size == MAX_SIZE) {
			System.out.println("용량초과");
		}else
			userList[size++] = user;
	}
	
	//전체사용자 리턴
	public User[] getList() {
		return userList;
	}
	
	//일반 사용자 리턴
	public User[] getUsers() {
		User[] JustUsers = new User[size];
		int JustUsersize = 0;
		for(int i = 0; i < userList.length; i++) {
			if (userList[i] instanceof VipUser) {
				continue;
			}else
				JustUsers[JustUsersize] = userList[i];
				JustUsersize++;
		}
		return JustUsers;
	}
	
	//우수 사용자 리턴
	public VipUser[] getVipUsers() {
		VipUser[] VipUsers = new VipUser[size];
		int VipUsersize = 0;
		for(int i = 0; i < userList.length; i++) {
			if(userList[i] instanceof VipUser) {
				VipUsers[VipUsersize] = (VipUser) userList[i];
				VipUsersize++;
			}
		}
		return VipUsers;
	}
	
	
	//사용자 검색하기
	public User[] searchByName(String name) {
		User[] searchByName = new User[size];
		int searchsize = 0;
		for(int i = 0; i < userList.length; i++) {
			if(userList[i].getName().contains(name)) {
				searchByName[searchsize] = userList[i];
			}
		}
		return searchByName;
	}

	//사용자 평균 나이
	public double getAgeAvg() {
		double total = 0;
		for(int i = 0; i < size; i++) {
			total += userList[i].getAge();
		}
		return total/size;
	}
}
