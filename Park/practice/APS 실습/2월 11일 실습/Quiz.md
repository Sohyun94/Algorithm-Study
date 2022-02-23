```java
public class Quiz {

	// Quiz. 2차원 배열 탐색
	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int row = arr.length;
		int column = arr[0].length;

		System.out.println("-----------------------------------------");
		System.out.println("[ 행 우선 순회(순방향) ]");

		// 1-1. 행 우선 순회 (좌에서 우로)
		for (int i = 0; i < row * column; i++) {
			int rowNum = i / column;
			int colNum = i % column;

			System.out.printf("%3d", arr[rowNum][colNum]);
			if (colNum == column - 1) {
				System.out.println();
			}
		}

		System.out.println("-----------------------------------------");
		System.out.println("[ 행 우선 순회(역방향) ]");

		// 1-2. 행 우선 순회 (우에서 좌로)
		for (int i = 0; i < row * column; i++) {
			int rowNum = i / column;
			int colNum = column - 1 - i % column;

			System.out.printf("%3d", arr[rowNum][colNum]);
			if (colNum == 0) {
				System.out.println();
			}
		}

		System.out.println("-----------------------------------------");
		System.out.println("[ 열 우선 순회(순방향) ]");

		// 2-1. 열 우선 순회(위에서 아래로)
		for (int i = 0; i < row * column; i++) {
			int rowNum = i % row;
			int colNum = i / row;

			System.out.printf("%3d", arr[rowNum][colNum]);
			if (rowNum == row - 1) {
				System.out.println();
			}
		}

		System.out.println("-----------------------------------------");
		System.out.println("[ 열 우선 순회(역방향) ]");

		// 2-2. 열 우선 순회(아래에서 위로)
		for (int i = 0; i < row * column; i++) {
			int rowNum = row - 1 - i % row;
			int colNum = i / row;

			System.out.printf("%3d", arr[rowNum][colNum]);
			if (rowNum == 0) {
				System.out.println();
			}
		}

		System.out.println("-----------------------------------------");
		System.out.println("[ 지그재그 순회(행 방향) ]");

		// 3-1. 지그재그 순회(행방향)
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				// 행에 따라 j의 값을 결정하고 싶다. (i%2)를 활용
				System.out.printf("%3d", arr[i][j + (column - 1 - 2 * j) * (i % 2)]);
			}
			System.out.println();

		}

		System.out.println("-----------------------------------------");
		System.out.println("[ 지그재그 순회(열 방향) ]");

		// 3-2. 지그재그 순회(열방향)
		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				// 행에 따라 j의 값을 결정하고 싶다. (i%2)를 활용
				System.out.printf("%3d", arr[j + (row - 1 - 2 * j) * (i % 2)][i]);
			}
			System.out.println();

		}

	}

}
```

