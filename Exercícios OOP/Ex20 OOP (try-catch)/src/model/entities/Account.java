package model.entities;

import model.exceptions.AccountException;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;

	public Account() {
	}

	public Account(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {

		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > withdrawLimit) {
			throw new AccountException("The amount exceeds withdraw limit");
		} else if (balance < amount) {
			throw new AccountException("Not enough balance");
		} else if (amount < 0) {
			throw new AccountException("Amount must be a positive number");
		}

		this.balance -= amount;
	}
}
