package xxx;

public class Elephant extends Animal{
	private String name;
	
	public Elephant(){

	}
	public Elephant(int age, float weight,String name){
		super(age, weight);
		this.name = name;
	}
	
	@Override	//給編譯器的資訊，讓編譯器對此方法是用Override規則檢查(安全)，防止不小心變成Overloading的狀態
	public void speak() {
		super.speak();
		System.out.print("名字:" + name);
	}
	

}
