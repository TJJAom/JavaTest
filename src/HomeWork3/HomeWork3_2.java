package HomeWork3;
//• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//對則顯示正確訊息,如圖示結果:
import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int guessNumber = (int) (Math.random() * 10);
//		System.out.println(guessNumber);
//		
//
		while (true) {
			int data1 = sc.nextInt();
			if (data1 == guessNumber) {
				System.out.println("猜對了好厲害!答案就是"+ guessNumber);
				break;

			} else {

				System.out.println("猜錯嚕重來");
			}
		}
	}
}
