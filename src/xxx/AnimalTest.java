package xxx;


public class AnimalTest {
	public static void main(String[] args)
	{
		Animal an = new Animal(3,8);
		Elephant el = new Elephant(8,1200.0f,"大象");
		
		an.speak();
		el.speak();
	}
}
