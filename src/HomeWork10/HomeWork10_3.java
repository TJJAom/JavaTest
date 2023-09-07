package HomeWork10;

import static java.lang.System.out;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//• 請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)
//年/月/日(2)月/日/年(3)日/月/年三選一，而輸入非指定日期數字格式會顯示出提示訊息如圖
//(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)

public class HomeWork10_3 {
	public static void main(String[] args) {
		String a = null;
		Integer b = null;
		System.out.println("請輸入日期(年月日，例如:20110131):");
		while (a == null) {
			Scanner sc1 = new Scanner(System.in);
			try {
				a = sc1.next();

				if (!a.matches("^[0-9][4][0-1]{1}[0-9]{1}[0-3]{1}[0-9]{1}$")) {
					System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
					while (b == null) {
						Scanner sc2 = new Scanner(System.in);

						try {
							b = sc2.nextInt();
						} catch (Exception e) {
							System.out.println("數字格式不正確，請再輸入一次!");
						}
					}

					Date test = new SimpleDateFormat("yyyyMMdd").parse(a);
					Date aa;

					switch (b) {
					case 1:
						SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
						System.out.println(d.format(test));
						break;
					case 2:
						SimpleDateFormat y = new SimpleDateFormat("MM/dd/yyyy");
						System.out.println(y.format(test));
						break;
					case 3:
						SimpleDateFormat u = new SimpleDateFormat("dd/MM/yyyy");
						System.out.println(u.format(test));
						break;
					}
				} else
					System.out.println("日期格式不正確，請再輸入一次!");

			} catch (Exception e) {
				System.out.println("日期格式不正確，請再輸入一次!");
			}
		}
	}
}
