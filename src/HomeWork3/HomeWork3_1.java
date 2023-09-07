package HomeWork3;
//• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
import java.util.Scanner;

public class HomeWork3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please insert");

		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();

		if (data1 == data2) {
			if (data2 == data3) {
				// 正三角
				System.out.println("正三角形");
			} else {
				System.out.println("等腰三角形");

			}
		} else if (data2 == data3 || data1 == data3) {
			// 等腰
			System.out.println("等腰三角形");
		} else if (data1 <= 0 || data2 <= 0 || data3 <= 0) {
			System.out.println("不是三角形");

		} else {
			System.out.println("其他三角形");

		}
	}
}
