```java
public class VipUser extends User {

	// 필드
	private String grade;
	private int point;

	// 기본 생성자
	public VipUser() {
		super(); // 부모 기본 생성자
	}

	// 생성자
	public VipUser(String id, String password, String name, String email, int age, String grade, int point) {
		super(id, password, name, email, age); // 부모 생성자
		this.grade = grade;
		this.point = point;
	}

	// Getter & Setter
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	// toString Overriding
	@Override
	public String toString() {
		return super.toString() + ", grade=" + grade + ", point=" + point + "]";
	}

}
```

