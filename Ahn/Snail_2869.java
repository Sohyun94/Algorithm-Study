import java.util.Scanner;

public class Snail_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수
		long a = sc.nextInt();
		long b = sc.nextInt();
		long v = sc.nextInt();
		long day = 0;
		long num = 0;
		if(a >= v) {
			day = 1;
			} 
		else {
			while(true) {
				day = v - a / (a - b);
					day += 1;
					break;
			}
		}
		System.out.println(day);
	}
}
