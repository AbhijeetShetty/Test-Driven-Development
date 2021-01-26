package com.tdd.de.TestDrivenDevelopment;

public class Sum implements Expression {

	Money augmend;
	Money addmend;
	public Sum(Money augmend, Money addmend) {
		super();
		this.augmend = augmend;
		this.addmend = addmend;
	}
	
	public Money reduce(String currency) {
		int amount= augmend.amount + addmend.amount;
		return new Money(amount,currency);
	}
	
}
