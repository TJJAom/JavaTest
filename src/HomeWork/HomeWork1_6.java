package HomeWork;

public class HomeWork1_6 {

	public static void main(String[] args)
	{
		System.out.println(5+5);
		//輸出結果為 10
		//因為在算術運算子(+)的左右兩邊的值都為整數型態，所以相加時會是整數相加，5+5就會等於10
		System.out.println(5+'5');
		//輸出結果為 58
		//因為在算術運算子(+)右邊的值為char(字元)，所以在相加時 java 會先將字元'5'依照 Unicode 轉成整數，
		//而'5'在 Unicode 中是 0x35，也就是十進位的 53，最後 5+53 就會等於 58
		System.out.println(5+"5");
		//輸出結果為 55
		//因為在算術運算子(+)右邊的值為String(字串)，所以在相加時，java 只是單純的將左邊的整數5 與右邊的字串5合併在一起
		//所以最後輸出的結果會是55 (左邊的5為整數,右邊的5為字串)
	}
}

