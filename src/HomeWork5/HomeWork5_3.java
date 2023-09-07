package HomeWork5;
//• 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳:
public class HomeWork5_3 {
	static int[][] intArray = {
			{1,6,3},{9,5,2}
	};
	static double[][] doubleArray = {
			{1.2,3.5,2.2},
			{7.4,2.1,8.2}
	};
	public int maxElement(int x[][])
	{
		int maxNum = 0;
		for(int i = 0;i<x.length;i++)
		{
			for(int j = 0;j<x[i].length;j++)
			{
				if(x[i][j] >= maxNum)
				{
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
	public double maxElement(double x[][])
	{
		double maxNum = 0;
		for(int i = 0;i<x.length;i++)
		{
			for(int j = 0;j<x[i].length;j++)
			{
				if(x[i][j] >= maxNum)
				{
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
	public static void main(String[] args)
	{
		HomeWork5_3 hm = new HomeWork5_3();
		System.out.println(hm.maxElement(intArray));
		System.out.println(hm.maxElement(doubleArray));
	}
	
}
