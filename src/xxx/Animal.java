package xxx;

public class Animal {
	private int age;
	private float weight;
	
	//保留著無參數建構子
	public Animal() {
		//1.給子類別的對應
		//2.給日後搭配的工具(框架(Framework))使用，框架會利用此建構子幫我們建立物件
		
	}

	public Animal(int age, float weight) {
		if (age >= 0)
			this.age = age;
		else
			System.out.println("年齡錯誤");

		if (weight > 0)
			this.weight = weight;
		else
			System.out.println("體重錯誤");
	}

	public void speak() {
		System.out.println("年齡:" + age);
		System.out.println("體重:" + weight);
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return this.age;
	}

	public float getWeight() {
		return this.weight;
	}
}
