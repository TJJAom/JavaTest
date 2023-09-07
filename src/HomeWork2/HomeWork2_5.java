package HomeWork2;

//• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class HomeWork2_5 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		System.out.println("阿文可以選擇的數字有以下:");
		
		for(int i = 1;i<= 49;i++)
		{
			if((i % 10 !=4) && (i / 10 != 4))
			{
				System.out.print(i + " ");
				cnt++;
			}
		}
		System.out.printf("\n共有 %d 個數字是阿文可以選擇的",cnt);
	}
}
