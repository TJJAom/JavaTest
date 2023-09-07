package HomeWork9;


//• 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。
class Bank {
	private int bankMoney = 0;// 戶頭的錢

	synchronized void bearDa(int money) { // 熊大
		while (bankMoney < 1000) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			if (HomeWork9_2.stop == true)
				break;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		bankMoney = bankMoney - money;
		System.out.println("熊大領了" + money + "，帳戶共有:" + bankMoney);

		if (bankMoney <= 2000) {
			System.out.println("媽媽被熊大要求匯款!");
			notify();
		}
	}

	synchronized void mom(int money) { // 媽媽
		while (bankMoney >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			if (HomeWork9_2.stop == true)
				break;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		bankMoney = bankMoney + money;
		System.out.println("媽媽存了" + money + "，帳戶共有:" + bankMoney);

		if (bankMoney >= 2000) {
			System.out.println("熊大被老媽告知帳戶已經有錢!");
			notify();
		}
	}
}

class BearDa extends Thread {
	Bank bank;

	public BearDa(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			bank.bearDa(1000); // 每次領出1000
		HomeWork9_2.stop = true;
	}

}

class Mom extends Thread {
	Bank bank;

	public Mom(Bank bank) {
		this.bank = bank;

	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			bank.mom(2000); // 每次存入2000
		HomeWork9_2.stop = true;
	}

}

public class HomeWork9_2 {
	public static boolean stop = false; // 「停止」變數

	public static void main(String[] args) {
		Bank bank = new Bank();
		BearDa bearDa = new BearDa(bank);
		Mom mom = new Mom(bank);
		bearDa.start();
		mom.start();
	}
}
