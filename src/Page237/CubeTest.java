package Page237;

public class CubeTest {
	public static void main(String[] args) {

		try {
			Cube cu = new Cube(-3);
			System.out.println(cu.getVolume());
		} catch (CubeException e) {
			e.printStackTrace();
		}

	}
}
