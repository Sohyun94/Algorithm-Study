package com.ssafy.hw06.step2;

import java.util.Arrays;

public class UserManager {
	private final int MAX_SIZE = 100; // 메모리의 최대 사이즈 설정
	private int size = 0; // 현재 저장중인 데이터의 수
	private User[] userList = new User[MAX_SIZE]; // 메모리의 최대 사이즈 할당

	/**
	 * idx=0부터 순차대로 조회하면서 userList가 null이면 해당 index에 인자를 삽입
	 * 오류(아마도 outofindex)나면 "저장소를 추가해주세요"를 화면에 출력
	 * @param user
	 */
	public void add(User user) {
		try {
			for (int i = 0; i < MAX_SIZE; i++) {
				if (userList[i] == null) {
					userList[i] = user;
					size++;
					break;
				}
			}
		} catch (Error e) {
			System.out.println(e + "저장소를 추가해주세요");
		}
	}

	/**
	 * @return User[] : 모든 유저
	 */
	public User[] getList() {
		return Arrays.copyOf(userList, size);
	}

	/**
	 * @return User[] : 일반 유저
	 */
	public User[] getUsers() {
		User[] genUser = new User[size];
		int sizeLoc = 0;
		for (int i = 0; i < size; i++) 
			if (userList[i] instanceof User)
				genUser[sizeLoc++] = userList[i];
		return Arrays.copyOf(genUser, sizeLoc);
	}

	/**
	 * @return VipUser[] : Vip 유저
	 */
	public VipUser[] getVipUsers() {
		VipUser[] vipUser = new VipUser[size];
		int sizeLoc = 0;
		for (int i = 0; i < size; i++) {
			if (userList[i] instanceof VipUser)
				vipUser[sizeLoc++] = (VipUser) userList[i];
		}
		return Arrays.copyOf(vipUser, sizeLoc);
	}

	/**
	 * @param name
	 * @return User[] : 이름에 'name'이 포함된 모든 유저
	 */
	public User[] searchByName(String name) {
		User[] searchUser = new User[size];
		int sizeLoc = 0;
		for (int i = 0; i < size; i++)
			if (userList[i].getName().contains(name))
				searchUser[sizeLoc++] = userList[i];
		return Arrays.copyOf(searchUser, sizeLoc);
	}

	/**
	 * @return double : 평균 나이
	 */
	public double getAgeAvg() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += userList[i].getAge();
		}
		return sum / size;
	}
}
