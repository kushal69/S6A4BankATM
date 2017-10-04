package com;

//	BankATM Class
public class BankAtm {
	//	Few variable where Bank and ATM details are stored
	String atmId;
	String bankName;
	String location;
	double balance;

	//	Method to withdraw from the ATM and also throws BankATMException
	public void withdraw(double amt) throws BankATMException {
		if (balance < 10000) {												//	If the balance is less than 10000 throws exception
			throw new BankATMException("ATM does not have enough cash....");
		} else if (amt > balance) {											//	If withdraw amount is greater than atm balance amount throws exception
			throw new BankATMException("You are trying to withdraw more cash than the ATM has....");
		} else {															//	If the above conditions are satisfied then the user entered amt will be withdraw
			balance = balance - amt;
			System.out.println("Amount " + amt + " has been withdrawed Successfully.");
			System.out.println("Balance amount is : " + balance);
		}
	}

	//	Method to Deposit amount into ATM
	public void deposit(double amt) {
		balance = balance + amt;											//	User entered amount will added to the ATM balance
		System.out.println("Amount " + amt + " has been deposited Successfully.");
		System.out.println("Balance amount is : " + balance);
	}
}