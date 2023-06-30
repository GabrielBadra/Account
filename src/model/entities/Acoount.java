package model.entities;

import model.exception.DomainException;

public class Acoount {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Acoount() {
	}
	public Acoount(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	
	public Double getBalance() {
		return balance;
	}
	public void addBalance(Double balance) {
		this.balance += balance;
	}
	
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(Double valor) throws DomainException {
		if(valor > withdrawLimit) {
			//ERROR THROW
			throw new DomainException("withdraw error: value must be smaller limit");
		}
		if(valor > balance) {
			// ERROR THROW
			throw new DomainException("withdraw error: not enough balance");
		}
		
		balance -= valor;
	}
	
}
