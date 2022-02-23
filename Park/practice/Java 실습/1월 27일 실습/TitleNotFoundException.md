```java
public class TitleNotFoundException extends Exception {

	private String title;

	public TitleNotFoundException(String title) {
		super(title);
	}

	public String getTitle() {
		return title;
	}

}
```

