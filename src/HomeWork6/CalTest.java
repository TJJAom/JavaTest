package HomeWork6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException
	{
		int x = 0,y=0;
		Scanner sc = new Scanner(System.in);
		Calculator ca = new Calculator();
		try {
			System.out.println("請輸入x的值:");
			x = sc.nextInt();
			System.out.println("請輸入y的值:");
			y = sc.nextInt();
		}catch(Exception e){
			System.out.println("輸入格式不正確");	
		}
		
		System.out.println(x+"的"+y+"次方等於"+ca.powerXY(x,y));
		
	}
}
