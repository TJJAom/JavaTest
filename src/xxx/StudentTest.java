package xxx;

public class StudentTest {
	public static void main(String[] args) {
		Student Tom = new Student();
		Student Louis = new Student();

		Tom.play(3);
		Tom.study(3);

		Louis.play(5);
		Louis.study(8);

		System.out.println("Tom 的分數為 : " + Tom.score);
		System.out.println("Louis 的分數為 : " + Louis.score);
	}
}
