package HomeWork;

//題目:
//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)

public class HomeWork1_5 {
	public static void main(String[] args)
	{
		int i;
		double property = 1500000;
		
		for(i=0;i<10;i++)
		{
			property = (property * 1.02);
		}
		
		System.out.printf("本金加利息共有:%.0f",property);
	}
}
