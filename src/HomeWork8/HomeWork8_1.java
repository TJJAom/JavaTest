package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork8_1 {
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add(new String("Kitty"));
		list.add(new Integer(100));
		list.add(new Object());
		list.add(new String("Snoopy"));
		list.add(new BigInteger("1000"));
		//印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		System.out.println("======= 使用Iterator ========");
		Iterator objs = list.iterator();
		while(objs.hasNext())
		{
			System.out.println(objs.next());
		}
		System.out.println("======= 使用傳統for迴圈 =======");
		for(int i = 0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("======= 使用foreach迴圈 =======");
		for(Object XX:list)
		{
			System.out.println(XX);
		}
		System.out.println("======= 移除不是java.lang.Number相關的物件 =======");
		//移除不是java.lang.Number相關的物件
		Iterator objs2 = list.iterator();
		while(objs2.hasNext())
		{
			Object obj3 = objs2.next();
			if(!(obj3 instanceof Number))
				objs2.remove();
		}

		System.out.println("======= 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功 =======");
		for(Object XX:list)
		{
			System.out.println(XX);
		}
	}

}
