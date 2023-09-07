package xxx;

public class TestBMI {
	public static void main(String[] args)
	{
		double height=1.77,weight=103;
		
		double myBmi = weight / Math.pow(height, 2);
		
		if ( myBmi < 18.5 )
		{
			System.out.printf("我的 BMI 數值為 %.3f ，結果為\"過瘦\"",myBmi);
		}
		else if (myBmi < 24)
		{
			System.out.printf("我的 BMI 數值為 %.3f ，結果為\"正常\"",myBmi);
		}
		else
		{
			System.out.printf("我的 BMI 數值為 %.3f ，結果為\"過胖\"",myBmi);
		}
	}
}
