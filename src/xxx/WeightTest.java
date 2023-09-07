package xxx;

public class WeightTest{
	public static void main(String[] args)
	{
		WeightTable[] e = new WeightTable[3];
		e[0] = new Powder();
		e[1] = new Plane();
		e[2] = new Dog();
		for (int i = 0; i < e.length; i++)
			e[i].getWeightTool();
	}
}
