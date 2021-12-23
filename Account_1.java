package Class;

class Account1 {
	String name;
	int amount;
	
	Account1() {
	}
	
	Account1(String name, int money) {
		this.name = name;
		amount = money;
	}

	void print() {
		System.out.println(name + ", " + amount);
	}
}

public class Account_1 {

	public static void main(String[] args) {
		Account1 acct = new Account1();
		acct.print();
		Account1 acct1 = new Account1("Hongildong", 10000);
		acct1.print();
		
	}

}
