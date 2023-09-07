package HomeWork7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
	public static void main(String[] args) throws IOException
	{
		int row=0;
		File files = new File("Sample.txt");
		FileReader f1 = new FileReader(files);
		FileReader f2 = new FileReader(files);
		BufferedReader br = new BufferedReader(f2);
		
		System.out.println("檔案共有"+files.length()+"個位元組");
		int c=0;
		while(f1.read() != -1)
		{
			c++;
		}
		System.out.println("檔案共有"+c+"個字元");
		while(br.readLine()!=null)
		{
			row++;
		}
		System.out.println("檔案共有"+row+"列");

		
		br.close();
		f2.close();
		f1.close();
	}
}
