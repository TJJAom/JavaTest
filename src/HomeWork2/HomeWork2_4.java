package HomeWork2;

//• 請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
public class HomeWork2_4 {
	public static void main(String[] args) {
		int num = 1;
		int i = 3;
		while (num <= 100) {
			System.out.print(num + " ");
			num = num + i;
			i += 2;
		}
	}
}
