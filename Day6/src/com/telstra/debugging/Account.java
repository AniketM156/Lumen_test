package com.telstra.debugging;

class Account
{
	int accountId;
	String acountHolderName;
	double balance;
	
	Account(int accountId,String acountHolderName,double balance){
		this.accountId = accountId;
		this.acountHolderName = acountHolderName;
		this.balance = balance;
	}
//	@Override
//	public String toString() {
//		return "Account [acountId=" + acountId + ", acountHolderName=" + acountHolderName + ", balance=" + balance
//				+ "]";
//	}
	void displayAccountDetails() {
		System.out.println("account id " + accountId);
		System.out.println("name " + acountHolderName);
		System.out.println("balance " + balance);
	}
	
	void deposit(int amountToDeposit) {
		balance += amountToDeposit;
//		System.out.println("new balance " + balance);
	}
	
	void withdraw(int amountToWithdraw) {
		balance -= amountToWithdraw;
//		System.out.println("new balance " + balance);
	}
	double getBalance() {
		System.out.println("New balance is : " + balance);
		return balance;
	}
}

public class AccountApp{
	public static void main(String[] args) {
		Account account = new Account(1001,"Aniket",5000);
		account.displayAccountDetails();
		account.deposit(1000);
		account.getBalance();
		account.withdraw(2000);
		account.getBalance();
	}
}
