package HomeWork;

//題目:
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class HomeWork1_4 {
	public static void main(String[] args)
	{
		final double PI = 3.1415;
		int radius = 5;
		System.out.printf("圓面積為%.4f,圓周長為%.3f",radius*radius*PI,radius*2*PI);
	}
}
