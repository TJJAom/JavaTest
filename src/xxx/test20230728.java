package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test20230728 {
	public static void main(String[] args)
	{

		Set set = new TreeSet();
		
		while(set.size() < 6)
		{	
			set.add((int)(Math.random()*49)+1);	
		}
		
		Iterator it	= set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
