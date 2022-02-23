import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperMario_2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수
		List mushroom = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			mushroom.add(sc.nextInt());
		}

		int sum = (int) mushroom.get(0);

		for (int i = 1; i < 10; i++) {
			if (sum < 100)
				sum += (int) mushroom.get(i);
			else if (Math.abs(sum - (int) mushroom.get(i - 1) - 100) < sum - 100) {
				sum -= (int) mushroom.get(i - 1);
				break;
			} else if (Math.abs(sum - (int) mushroom.get(i - 1) - 100) >= sum - 100)
				break;
		}
		System.out.println(sum);
	}
}
