package com.ssafy.hw06;

import java.util.Arrays;

public class UserManager {
//사용자 최대한 담을 수 있는 크기
	private static int MAX_SIZE = 100;
//관리하는 사용자 명단
	private User[] userList = new User[MAX_SIZE];
//현재 등록된 사용자 수 & 인덱스
	private int size = 0;

//사용자 추가 메서드
//@param user : 추가할 사용자
	public void add(User user) {
		if (size < MAX_SIZE) {
			// 사용자 저장
			userList[size++] = user;
		} else {
			System.out.println(MAX_SIZE + "더 이상 등록할 수 없습니다.");
		}
	}

	// 등록된 전체 사용자 명단 반환
	// @return 등록된 전체 사용자 명단
	public User[] getList() {
		User[] result = new User[size];
		return Arrays.copyOfRange(userList, 0, size);
	}

	// 전체 사용자 리스트 반환
	public User[] getUsers() {
		int cnt = 0;
		// 유저 수 체크
		for (int i = 0; i < size; i++) {
			if (userList[i] instanceof User) {
				cnt++;
			}
		}
		User[] result = new User[cnt];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (userList[i] instanceof User) {
				result[idx++] = userList[i];
			}
		}
		return result;
	}

	// VIP 사용자 리스트만 반환
	// @return 등록된 사용자
	public VipUser[] getVipUsers() {
		int cnt = 0;
		// VIP 유저 수 체크
		for (int i = 0; i < size; i++) {
			if (userList[i] instanceof VipUser) {
				cnt++;
			}
		}
		VipUser[] result = new VipUser[cnt];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (userList[i] instanceof VipUser) {
				result[idx++] = (VipUser) userList[i];
			}
		}
		return result;
	}

	// 해당 인자가 이름에 들어가는 사용자 명단 반환
	// @param name
	// @return 이름을 포함하는 사용자 배열
	public User[] searchByName(String name) {
		int cnt = 0;
		for (int i = 0; i < size; i++) {
			if (userList[i].getName().contains(name)) {
				cnt++;
			}
		}
		User[] result = new User[cnt];
		int idx = 0;
		for (int i = 0; i < size; i++) {
			if (userList[i].getName().contains(name)) {
				result[idx++] = userList[i];
			}
		}
		return result;
	}
	public double getAgeAvg() {
		double sum = 0;
		for (int i = 0 ; i <size ; i++) {
			sum+= userList[i].getAge();
		}
		return sum / size;
	}
}
