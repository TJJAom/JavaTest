package HomeWork9;

public class HomeWork9_1  extends Thread implements Runnable {
	public static boolean ready = false; //「開跑」變數
	static int jamescnt = 0;
	static int mantoCnt = 0;
	
	public HomeWork9_1(String name){
		super(name);
	}
	
	public void run() {
        while (!ready) {
        } // 只要沒開跑，就不執行下一行。
        while(true) {
			try {
				Thread.sleep((int)(Math.random()* 2501)+500 ); // 暫停一秒
			} catch (Exception e) {
			}
        	if(getName().equals("詹姆士"))
        	{
        		jamescnt++;
        		System.out.println("詹姆士吃第"+jamescnt+"碗飯");
        		if(jamescnt >= 10)
        		{
        			System.out.println("詹姆士吃完了!");
        			break;
        		}
        	}
        	else if(getName().equals("饅頭人"))
        	{
        		mantoCnt++;
        		System.out.println("饅頭人吃第"+mantoCnt+"碗飯");
        		if(mantoCnt >= 10)
        		{
        			System.out.println("饅頭人吃完了!");
    				break;
        		}
        	}
			
//        	
        }
        if(jamescnt == 10 && mantoCnt==10)
        	System.out.println("-------- 大胃王快食比賽結束! --------");
	}
	
	public static void main(String[] args)
	{
		HomeWork9_1 run1 = new HomeWork9_1("詹姆士");
		Thread t1 = new Thread(run1);
		HomeWork9_1 run2 = new HomeWork9_1("饅頭人");
		Thread t2 = new Thread(run2);

		
		t1.start();
		t2.start();
		
		System.out.println("-------- 大胃王快食比賽開始 ! --------");
		ready = true;
	}

}
