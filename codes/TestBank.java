abstract class BankAccount {
	protected String accountHolder;
	protected double balance;

	BankAccount(String accountHolder, double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited : " + amount);
	}

	void showBalance() {
		System.out.println("Balance : " + balance);
	}
}


class SavingsAccount extends BankAccount {
	SavingsAccount(String accountHolder, double balance) {
		super(accountHolder, balance);
	}

	void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn : " + amount);
		} else
			System.out.println("Insufficient funds.");
	}
}

public class TestBank {
	public static void main(String[] args) {
		BankAccount acc = new SavingsAccount("Mohit",1500);
		acc.deposit(500);
		acc.showBalance();
		acc.withdraw(700);
		acc.showBalance();
	}
}