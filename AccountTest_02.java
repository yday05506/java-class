package Class;

class Account2 {
	private int Acc_num;
	private int balance;	//잔액 : balance
	static int baseAcc_num = 100;	//static : 클래스 변수 
	static final double interest = 0.02;
	
	void fixedDeposit(int principal, int year) {
		balance = principal + (int)(principal * interest) * year;
	}
	
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
	
	public String toString() {	// 문자로 바꿔주는 메소드
		return "계좌 : " + Acc_num + "\n" + "잔액 : " + balance + "\n";
	}
	
	Account2() {
		Acc_num = ++baseAcc_num;
	}
}

public class AccountTest_02 {

	public static void main(String[] args) {
		//System.out.println(Account.baseAcc_num);
		
		Account2 Ac1 = new Account2();
		//System.out.println(Account.baseAcc_num);
		//System.out.println(Ac1.baseAcc_num);
//		Ac1.fixedDeposit(100000, 3);
		Ac1.deposit(5000);
		System.out.println(Ac1.toString());
		Ac1.withdraw(2000);
		System.out.println(Ac1.toString());
		Ac1.withdraw(3500);
		System.out.println(Ac1.toString());
		System.out.println();
		
		Account2 Ac2 = new Account2();
		//System.out.println(Account.baseAcc_num);
		//Ac2.Acc_num = "102";
		System.out.println(Ac2.toString());
		
		Account2 Ac3 = new Account2();
		Ac3.fixedDeposit(100000, 3);
		System.out.println(Ac3.toString());
	}

}