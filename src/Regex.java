import java.util.Scanner;
//練習正則表達示  帥
public class Regex {
	public static void main(String[] args)
	{
		System.out.println("請輸入身分證字號");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
//		id = id.toUpperCase(); 可以將英文轉大寫
//		String regex = "^[A-Za-z][1-2][0-9]{8}$";
		String regex = "^[A-Z][1-2][0-9]{8}$";
		
		if(id.matches(regex))
			System.out.println("身分證輸入正確!帥");
		else
			System.out.println("身分證輸入錯誤!!");
		
		sc.close();
	}
}
