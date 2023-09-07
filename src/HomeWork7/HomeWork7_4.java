package HomeWork7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class HomeWork7_4 {
	public static void main(String[] args) throws Exception
	{
		File filesFloder = new File("C:\\data");
		if(!filesFloder.exists())
			filesFloder.mkdirs();
		
		File files = new File("C:\\data\\Object.ser");
		if(!files.exists())
			files.createNewFile();
		
		Animal[] ani = new Animal[4];
		ani[0] = new Cat("貓1");
		ani[1] = new Cat("貓2");
		ani[2] = new Dog("狗1");
		ani[3] = new Dog("狗2");
		

		//輸出
		FileOutputStream fs = new FileOutputStream(files);
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		for(int i=0;i<ani.length;i++)
		{
			oos.writeObject(ani[i]);
		}
		oos.close();
		fs.close();
		
		//輸入
		FileInputStream fis = new FileInputStream(files);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(files.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (Exception e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
	}
}
