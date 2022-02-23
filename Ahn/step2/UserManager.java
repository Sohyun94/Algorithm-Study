package com.ssafy.hw06.step2;

import java.util.Arrays;


public class UserManager {
	private static int MAX_SIZE = 100;
	private int size = 0;
	private User[] userList = new User[MAX_SIZE];
	
	/**
	 * User정보를 추가하세요
	 * @param user
	 */
	public void add(User user) {
		if(size < MAX_SIZE) 
			userList[size++] = user;
		else
			System.out.println("없는 번호입니다.");
	}
	
	public User[] getList() {
		return Arrays.copyOfRange(userList, 0, size);
	}
	
	/**
	 * 유저 반출
	 * @return
	 */
	public User[] getUsers() {
		int cnt = 0;
		for(int i = 0; i < size; i ++) {
			if(userList[i] instanceof User)
				cnt++;
		}
		User[] result = new User[cnt];
		int idx = 0;
		for(int i = 0; i<size; i++) {
			result[idx++] = (User)userList[i];
		}
		return result;
	}

	/** vip 유저 반출
 * 
 * @return
 */
	public VipUser[] getVipUsers(){
		int cnt = 0;
		for(int i = 0; i < size; i ++) {
			if(userList[i] instanceof VipUser)
				cnt++;
		}
		VipUser[] result = new VipUser[cnt];
		int idx = 0;
		for(int i = 0; i<size; i++) {
			if(userList[i] instanceof VipUser)
				result[idx++] = (VipUser)userList[i];
		}
		return result;
	}
	
	/**
	 * 이름을 검색합니다.
	 * @param name
	 * @return
	 */
	public User[] searchByName(String name) {
		int cnt = 0;
		for(int i = 0; i < size; i++) 
			if(userList[i].getName().contains(name)) //이름의 내용이 들어있다면
				cnt++;
		User[] result = new User[cnt];
		int idx = 0;
		for(int i = 0; i < size; i++) {
			if(userList[i].getName().contains(name))
				result[idx++] = (User)userList[i];
		}
		return result;
		}
	
	/**
	 * 평균 나이를 구합니다
	 * @return
	 */
	public double getAgeAvg() {
		double sum = 0;
		int i;
		for(i = 0; i < size; i++)
			sum = sum + userList[i].getAge();
		return (sum / i);
	}
	
}
