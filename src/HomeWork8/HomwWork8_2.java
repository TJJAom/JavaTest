package HomeWork8;
//• 請設計一個Train類別,並包含以下屬性:

//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//- 目的地 dest,型別為String - 票價 price,型別為double
//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//需使用的集合裡
//- (202, "普悠瑪", "樹林", "花蓮", 400)
//- (1254, "區間", "屏東", "基隆", 700)
//- (118, "自強", "高雄", "台北", 500)
//- (1288, "區間", "新竹", "基隆", 400)
//- (122, "自強", "台中", "花蓮", 600)
//- (1222, "區間", "樹林", 七堵, 300)
//- (1254, "區間", "屏東", "基隆", 700)

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class HomwWork8_2 {

	public static void main(String[] args) {
		Set<Train> set = new HashSet<Train>();
		TreeSet<Train> treeSet = new TreeSet<Train>();
		ArrayList<Train> arrayList = new ArrayList<Train>();

		// 使用建構子建立資料
		Train tra1 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train tra2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train tra3 = new Train(118, "自強", "高雄", "台北", 500);
		Train tra4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train tra5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train tra6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train tra7 = new Train(1254, "區間", "屏東", "基隆", 700);

		set.add(tra1);
		set.add(tra2);
		set.add(tra3);
		set.add(tra4);
		set.add(tra5);
		set.add(tra6);
		set.add(tra7);
		
		System.out.println("========== 使用 foreach ==========");
		for (Train x : set) {
			System.out.println(x);
			treeSet.add(x);
		}

		System.out.println("----------------------------------");
		for (Train x : treeSet)
		{
			System.out.println(x);
			arrayList.add(x);
		}

		System.out.println("========== 使用 傳統for迴圈 ==========");
		
		for (int i=0;i<set.size();i++) {
			
			System.out.println(arrayList.get(i));
		}
		System.out.println("========== 使用 iterator ==========");
		
		Iterator obj = treeSet.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}


	}

}

class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public void printTreeSet() {
//		System.out.println(this.number + "," + this.type + "," + this.start + "," + this.dest + "," + this.price);
//	}

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	public String toString() {

		return number + "," + type + "," + number + "," + dest + "," + price;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Train other = (Train) obj;
//		return Objects.equals(dest, other.dest) && number == other.number
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
//				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
//	}
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && this.getClass() == obj.getClass()) {
			Train e = (Train) obj;
			if (this.number == e.number && Objects.equals(this.dest, e.dest) && // 使用 Objects.equals 处理空值
					Objects.equals(this.type, e.type) && Objects.equals(this.start, e.start) && this.price == e.price) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Train o) {

		if (this.number > o.number)
			return -1;
		else if (this.number == o.number)
			return 0;
		else
			return 1;
	}

//	@Override
//	public int compareTo(Train o) {
//		return 0;
//	}

}
