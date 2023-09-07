package xxx;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args)
	{
		File dir = new File("");
		System.out.println(dir.getAbsolutePath());
		
//		try {
//			dir.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
