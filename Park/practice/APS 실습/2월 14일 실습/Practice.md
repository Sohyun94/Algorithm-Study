```java
public class Practice {

	// 개별 실습. atoi, itoa
	public static void main(String[] args) {

		String num1 = "123";
		String num2 = "-123";

		System.out.println(atoi(num1));
		System.out.println(atoi(num2));

		int num3 = 123;
		int num4 = -123;

		System.out.println(itoa(num3));
		System.out.println(itoa(num4));

	}

	// atoi
	static int atoi(String str) {

		int result = 0;
		boolean isMinus = false;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 45) {
				isMinus = true;
				continue;
			}

			result = result * 10 + (str.charAt(i) - '0');

		}

		if (isMinus) {
			result = result * (-1);
		}

		return result;
	}

	// itoa
	static String itoa(int num) {

		String result = "";
		int positiveNum = Math.abs(num);
		int i = 1;

		while (true) {

			result = ((positiveNum % (int) Math.pow(10, i) - positiveNum % (int) Math.pow(10, i - 1))
					/ (int) Math.pow(10, i - 1)) + result;

			if (positiveNum / (int) Math.pow(10, i) == 0) {
				break;
			}

			i++;
		}

		if (num < 0) {
			result = "-" + result;
		}

		return result;
	}

}

```

