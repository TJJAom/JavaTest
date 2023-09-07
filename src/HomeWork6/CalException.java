package HomeWork6;
//自訂例外
public class CalException extends Exception{
	public CalException() {
		
	}
	public CalException(String message) {
		System.out.println(message);
	}
}
