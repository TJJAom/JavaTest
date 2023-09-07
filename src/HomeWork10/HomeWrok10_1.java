package HomeWork10;
//• 請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否
//為質數 (提示：Math類別)
public class HomeWrok10_1 {
	
	public static void main(String args[])
	{

		for(int i=0;i<5;i++)
		{
			int randomNum = (int)(Math.random()*100 + 1);
			if(isPrimeNumber(randomNum))
				System.out.println(randomNum+"是質數");
			else
				System.out.println(randomNum+"不是質數");
		}
		
	}
	public static boolean isPrimeNumber(final int n) {
		//雖然是網路上抄的，但有努力看懂，已下註解都是自己的理解，但最後看不太懂^_^
		
		
	    if (n == 2 || n == 3) {	//首先先判斷 n 是否為 2或3
	        return true;
	    } else if (n > 4) {		//如果 n 大於 4 則繼續以下
	        final int m = n % 6;	//由於 6n必定可以用 6 或 3 或 2 整除，所以接下來要做一些判斷
	 
	        if (m != 1 && m != 5) {	//當 6n 除以 6 之後餘數如果不是 1 或 5,就可以知道這個數字不是質數
	            return false;
	        }
	 
	        final int nSqrt = (int) Math.floor(Math.sqrt(n));//接著取n的平方根並且用Math.sqrt方法轉為小於等於n平方根的整數
	 
	        for (int i = 5; i <= nSqrt; i += 6) { //最後n % i: 6n + 5 -> 6(n + 1) - 1 -> 6n - 1, n % (i + 2): 6n + 1
	            if (n % i == 0 || n % (i + 2) == 0) { 
	                return false;
	            }
	        }
	        return true;
	    } else {
	        return false;
	    }
	}
}
