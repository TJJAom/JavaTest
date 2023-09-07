package HomeWork4;

import java.util.Scanner;

//• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

//如果年份能被4整除，但不能被100整除，则为闰年。
//如果年份能被400整除，则也是闰年。
public class HomeWork4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] dayArrays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int daySum = 0;
		System.out.println("請輸入西元 月 日");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		// 判斷是否為閏年
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			dayArrays[1] = 29;

		if (dayArrays[month - 1] < day) {
			System.out.println("日期不該超過" + dayArrays[month - 1]);
		} else {
			for (int i = 0; i < month - 1; i++) {
				daySum += dayArrays[i];
			}
			daySum += day;
		}
		System.out.println("輸入的日期為該年的第" + daySum + "天");
	}
}
