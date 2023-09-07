package HomeWork10;

import static java.lang.System.out;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

//• 請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位
//(2)百分比(3)科學記號，而輸入非任意數會顯示提示訊息如圖(提示： TestFormatter.java, Java API
//文件, 判斷數字可用正規表示法)
public class HomeWork10_2 {
	public static void main(String[] args) {
		Integer a = null;
		Integer b = null;
		String strA;
		
		System.out.println("請輸入數字:");
		while (a == null) {
			Scanner sc1 = new Scanner(System.in);

			try {
				a = sc1.nextInt();
			} catch (Exception e) {
				System.out.println("數字格式不正確，請再輸入一次!");
			}
		}
		System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號");

		while (b == null) {
			Scanner sc2 = new Scanner(System.in);

			try {
				b = sc2.nextInt();
			} catch (Exception e) {
				System.out.println("數字格式不正確，請再輸入一次!");
			}
		}
		
		switch(b){
			//========================== 千分位 =================================
			case 1:
				// 使用DecimalFormat類別
				Format dfm1 = new DecimalFormat("#,###");
				out.println(dfm1.format(a));

			break;
			//============================ 百分比 =================================
			case 2:
				Format dfm2 = new DecimalFormat("###");
				double c;
				c = a;
				c = c / 100;
				System.out.println(dfm2.format((c*100)) + "%");
			break;
			//============================= 科學記號 =================================
			case 3:
				double d;
				d = a;
				int e;
				e = ((int)Math.log10(d))+1;
				
				for(int i=0;i<e-1;i++)
				{
					d = d/10;
				}
				
				System.out.println(d+"E"+(e-1));
			break;
			//===================================================================
			default:
			break;
		}
	}
}
