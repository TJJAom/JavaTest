package xxx;

public class xyzArrayTest {
	public static void main(String[] args)
	{
		xyzArrayTest tra = new xyzArrayTest();
		
		int x[][] = tra.getRadnomArray();
		int y[][] = tra.getRadnomArray();
		int z[][] = new int [3][3];
		
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printArray(x);
		tra.printArray(y);
		tra.printArray(z);
	}
	
	public int[][] getRadnomArray()
	{
		int[][] data = new int[3][3];
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				data[i][j] = (int)(Math.random() * 31);
			}
		}
		return data;
	}
	public void printArray(int ret[][]) {
		for(int i = 0;i<ret.length;i++)
		{
			for(int j=0;j<ret[i].length;j++)
			{

//				z[i][j] = x[i][j] + y[i][j];
				System.out.print(ret[i][j] + "\t");
				
			}
			System.out.println();

			
			
		}
		System.out.println("=====================");
	}
}
