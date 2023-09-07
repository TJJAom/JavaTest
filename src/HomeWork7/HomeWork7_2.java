package HomeWork7;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class HomeWork7_2 {
	public static void main(String[] args) throws IOException
	{
		int RandomNum;
		
		FileOutputStream fw = new FileOutputStream("Data.txt",true);
		BufferedOutputStream bw = new BufferedOutputStream(fw);
		PrintStream ps = new PrintStream(bw);
		for(int i = 0;i<10;i++)
		{
			RandomNum = (int) ((Math.random()*1001)+1);
			ps.println(RandomNum);
		}
		ps.close();
		bw.close();
		fw.close();
	}
}
