package HomeWork5;
//• 身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合
public class HomeWork5_5 {
	
	public static void main(String[] args)
	{
		HomeWork5_5 hm = new HomeWork5_5();
		System.out.println("本次隨機產生的驗證碼為:");
		System.out.print(hm.genAuthCode());
	}
	
	public String genAuthCode() {
		
		String verificationCode="";
		int ret;
		for(int i = 0;i<8;i++)
		{
			ret=(int) (Math.random() * 3);
			switch(ret)
			{
				//數字 Unicode:48~57
				case 0:
					ret=((int) (Math.random() * 10))+ 48;
					break;
				//大寫英文 Unicode:65~90
				case 1:
					ret=((int) (Math.random() * 26))+ 65;
					break;
				//小寫英文 Unicode:97~122
				case 2:
					ret=((int) (Math.random() * 26))+ 97;
					break;
			}
			verificationCode += (char)ret;
		}
		return verificationCode;
	}
}
