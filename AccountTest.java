package Class;

class Account {
	private int Acc_num;
	private int balance;	//잔액 : balance
	static int baseAcc_num = 100;	//static : 클래스 변수 
	
	//입금
	void deposit(int money) {
		balance += money;
	}
	
	//출금
	void withdraw(int money) {
		if(money > balance)
			System.out.println("잔액이 부족합니다.");
		else
			balance -= money;
	}
	
	public String toString() {
		return "계좌 : " + Acc_num + "\n" + "잔액 : " + balance + "\n";
	}
	
	Account() {
		Acc_num = ++baseAcc_num;
	}
}

public class AccountTest {

	public static void main(String[] args) {
		Account Ac1 = new Account();
		Ac1.deposit(5000);
		System.out.println(Ac1.toString());
		Ac1.withdraw(2000);
		System.out.println(Ac1.toString());
		Ac1.withdraw(3500);
		System.out.println(Ac1.toString());
		System.out.println();
		
		Account Ac2 = new Account();
		//Ac2.Acc_num = "102";
		System.out.println(Ac2.toString());
	}

}
