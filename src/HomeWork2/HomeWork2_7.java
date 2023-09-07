package HomeWork2;
//• 請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class HomeWork2_7 {
	public static void main(String[] args)
	{
		int str = 0x41;
		
		for(int i = 1;i<=6;i++)
		{
			for(int j = 0;j<i;j++)
			{
				System.out.print((char)str);
			}
			System.out.println();
			str += 1;
		}
		
	}
}
