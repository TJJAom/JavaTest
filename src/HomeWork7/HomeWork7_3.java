package HomeWork7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork7_3 {
	public static void main(String[] args) throws IOException
	{
		copyFile("S1.txt","S2.txt");
	}
	
	public static void copyFile(String a,String b) throws IOException
	{
		FileReader fr = new FileReader(a);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(b);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int c;
		while((c = br.read()) != -1)
		{
			bw.write(c);
			bw.flush();
		}
	}
}
