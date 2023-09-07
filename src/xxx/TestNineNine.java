package xxx;

public class TestNineNine {
	public static void main(String[] args) {

		int j = 1;
		// 使用 for + while
		for (int i = 1; i <= 9; i++) {
			while (j <= 9) {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
				j++;
			}
			System.out.println();
			j = 1;
		}
		// 使用 for + do while
		for (int i = 1; i <= 9; i++) {
			do {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
			j = 1;
		}
		// 使用 while + do while
		int i = 1;
		while (i <= 9) {
			do {
				System.out.print(j + "x" + i + "=" + i * j + "\t");
				j++;
			} while (j <= 9);

			System.out.println();
			j = 1;
			i++;
		}
	}
}
