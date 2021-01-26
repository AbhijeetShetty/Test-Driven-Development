package com.tdd.de.TestDrivenDevelopment;

public class Bank {

	public Money reduce(Expression source, String currency) {
	/*	if (source instanceof Money)
			return (Money) source;
		Sum sum = (Sum) source;*/
		return source.reduce(currency);
	}

}
