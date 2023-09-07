package HomeWork5;

import java.util.Scanner;

//• 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

public class HomeWork5_1 {
	public static void main(String[] args)
	{
		int w,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入寬 高");
		w = sc.nextInt();
		h = sc.nextInt();
		
		starSquare(w,h);

	}

	public static void starSquare(int width , int height)
	{
		for(int i=0;i<height;i++)
		{
			for(int j=0;j<width;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
