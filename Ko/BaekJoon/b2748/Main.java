package b2748;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.close();
		
		long[] arr = new long[91];
		arr[0] = 0;	arr[1] = 1;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		System.out.println(arr[n]);
	}
}
