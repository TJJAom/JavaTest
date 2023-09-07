package Page237;

public class Cube {
	private double length;
	
	public Cube() {}

	public Cube(double length) throws CubeException{

		setLength(length);

		
	}
	
	public void setLength(double length) throws CubeException{
		if(length <= 0)
		{
			throw new CubeException("正立方體邊常不得為0或是負數");
		}
		else
		{
			this.length = length;
		}
		
	}
	public double getLength() {
		return this.length;
	}
	public double getVolume() {
		return Math.pow(this.length,3);
	}


}
