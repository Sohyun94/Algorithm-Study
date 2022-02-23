```java
import java.util.Arrays;

public class UserManager {

	// 최대 사이즈 상수
	private static final int MAX_SIZE = 100;
	// 회원 목록 배열 인덱스 번호
	private int size = 0;
	// 회원 목록 저장 배열 생성
	private User[] userList = new User[MAX_SIZE];

	// 회원 추가 메소드
	public void add(User user) {

		// 범위를 초과하는지 확인한 후 배열에 데이터 입력
		if (size < MAX_SIZE) {
			userList[size] = user;
			size++; // 추가하면 다음 인덱스 번호 부여
		} else {
			System.out.println("저장 가능한 회원수를 초과합니다."); // 메시지만 출력
		}

	}

	// 전체 회원 조회 메소드
	// 0번 인덱스부터 데이터가 존재하는 인덱스까지만 복사한 후 배열 반환
	public User[] getList() {

		return Arrays.copyOfRange(userList, 0, size);
	}

	// 일반 회원 조회 메소드
	public User[] getUsers() {

		int userCount = 0; // 일반 회원 수
		int index = 0; // 일반 회원 저장 배열 인덱스

		// 일반 회원 수 세는 로직
		for (int i = 0; i < size; i++) {
			if (!(userList[i] instanceof VipUser)) {
				userCount++;
			}
		}

		User[] generalUserList = new User[userCount]; // 일반 회원 목록 저장 배열

		// 일반 회원 저장 배열에 데이터를 입력하는 로직
		for (int i = 0; i < size; i++) {

			// VIP 회원으로 전환 가능 여부를 기준으로 일반 회원인지 판단
			if (!(userList[i] instanceof VipUser)) {
				generalUserList[index] = userList[i];
				index++;
			}
		}

		return generalUserList;

	}

	// 우수 회원 조회 메소드
	public VipUser[] getVipUsers() {

		int vipUserCount = 0; // 우수 회원 수
		int index = 0; // 우수 회원 저장 배열 인덱스

		// 우수 회원 수 세는 로직
		for (int i = 0; i < size; i++) {
			if (userList[i] instanceof VipUser) {
				vipUserCount++;
			}
		}

		VipUser[] vipUserList = new VipUser[vipUserCount]; // 우수 회원 저장 배열

		// 우수 회원 저장 배열에 데이터를 입력하는 로직
		for (int i = 0; i < size; i++) {

			// VIP 회원으로 전환 가능 여부를 기준으로 vip 회원인지 판단
			if (userList[i] instanceof VipUser) {
				vipUserList[index] = (VipUser) userList[i];
				index++;
			}
		}

		return vipUserList;

	}

	// 이름 검색 메소드
	public User[] searchByName(String name) {

		int searchUserCount = 0; // 조회되는 회원 수
		int index = 0; // 조회된 회원 저장 배열 인덱스

		// 조회된 회원 수 세는 로직
		for (int i = 0; i < size; i++) {
			if (userList[i].getName().contains(name)) {
				searchUserCount++;
			}
		}

		User[] searchUserList = new User[searchUserCount]; // 조회된 회원 저장 배열

		// 검색한 키워드가 포함된 회원 저장
		for (int i = 0; i < size; i++) {

			if (userList[i].getName().contains(name)) {
				searchUserList[index] = userList[i];
				index++;
			}
		}

		return searchUserList;

	}

	// 평균 연령 계산 메소드
	public double getAgeAvg() {

		// 연령 평균을 저장할 변수 생성
		double avg = 0;

		// 총 연령을 저장할 변수
		double sum = 0;

		// 연령을 더하는 로직
		for (int i = 0; i < size; i++) {
			sum += userList[i].getAge();
		}

		// 평균 계산
		avg = sum / size;

		return avg;
	}

}
```

