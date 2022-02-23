```java
public class UserTest {

	public static void main(String[] args) {

		// 회원 정보 입력
		User user1 = new User("user1", "1234", "홍길동", "user1@a.com", 24);
		User user2 = new User("user2", "1234", "김철수", "user2@a.com", 27);
		VipUser user3 = new VipUser("user3", "1234", "김지성", "user3@a.com", 30, "A", 100);
		VipUser user4 = new VipUser("user4", "1234", "이재용", "user4@a.com", 30, "A+", 1000);

		// 회원 관리 객체 생성
		UserManager um = new UserManager();

		// 1. 회원 추가
		um.add(user1);
		um.add(user2);
		um.add(user3);
		um.add(user4);

		// 2. 회원 전체 조회
		System.out.println("[전체 회원 조회 ]");

		User[] userList = um.getList(); // 회원 정보 배열 조회

		for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i].toString()); // 배열 내용 출력
		}

		System.out.println(); // 한 줄 띄기

		// 3. 일반 회원 조회
		System.out.println("[일반 회원 조회]");

		User[] generalUserList = um.getUsers(); // 일반 회원 정보 배열 조회

		for (int i = 0; i < generalUserList.length; i++) {
			System.out.println(generalUserList[i].toString()); // 일반 회원 정보 배열 내용 출력
		}

		System.out.println(); // 한 줄 띄기

		// 4. 우수 회원 조회
		System.out.println("[우수 회원 조회]");

		VipUser[] vipUserList = um.getVipUsers(); // 우수 회원 정보 배열 조회

		for (int i = 0; i < vipUserList.length; i++) {
			System.out.println(vipUserList[i].toString()); // 우수 회원 정보 배열 내용 출력
		}

		System.out.println(); // 한 줄 띄기

		// 5. 회원명 검색
		System.out.println("[\"김\"이 들어간 이름 찾기]");

		String name = "김"; // 검색 키워드

		User[] searchUserList = um.searchByName(name); // 검색 결과 배열 조회

		for (int i = 0; i < searchUserList.length; i++) {
			System.out.println(searchUserList[i].toString()); // 검색 결과 배열 내용 출력
		}

		System.out.println(); // 한 줄 띄기

		// 6. 평균 연령 조회
		System.out.println("[평균 연령 조회]");
		System.out.println("평균 연령 : " + um.getAgeAvg() + "세"); // 평균 연령 출력

	}

}
```

