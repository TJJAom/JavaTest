package HomeWork;

//題目:
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class HomeWork1_3 {
	public static void main(String[] args)
	{
		int sec = 256559;
		
		System.out.printf("256559秒為%d天",sec/86400);
		sec %= 86400;
		System.out.printf("%d小時",sec/3600);
		sec %= 3600;
		System.out.printf("%d分",sec/60);
		sec %= 60;
		System.out.printf("%d秒",sec);
		
	}
}
