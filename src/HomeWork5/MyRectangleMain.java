package HomeWork5;

public class MyRectangleMain {
	public static void main(String[] args)
	{
		MyRectangle mr = new MyRectangle();
		mr.setWidth(10);
		mr.setDepth(20);
		System.out.println(mr.getArea());
		

		MyRectangle mr2 = new MyRectangle(10,20);
		System.out.println(mr.getArea());
		
	}
}
