package xxx;

public class Student {
	int score = 80;

	public void play(int hours) {
		score = score - hours;
	}

	public void study(int hours) {
		score = score + hours;
	}

	public static void main(String[] args) {
		Student tom = new Student();
		Student louis = new Student();

		tom.play(27);
		tom.study(31);

		louis.play(2);
		louis.study(22);

		System.out.println("Tom 的分數為 : " + tom.score);
		System.out.println("Louis 的分數為 : " + louis.score);
	}

}
