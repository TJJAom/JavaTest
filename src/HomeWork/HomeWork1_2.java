package HomeWork;

//題目:
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class HomeWork1_2 {
	public static void main(String[] args)
	{
		int numberOfEggs = 200;
		System.out.printf("%d顆蛋為%d打%d顆",numberOfEggs,numberOfEggs/12,numberOfEggs%12);
	}
}
