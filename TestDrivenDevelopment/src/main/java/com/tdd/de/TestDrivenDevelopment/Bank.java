package com.tdd.de.TestDrivenDevelopment;

import java.util.HashMap;

public class Bank {

	private HashMap<Pair, Integer> rateMap = new HashMap<Pair, Integer>();

	public Money reduce(Expression source, String currency) {
		/*
		 * if (source instanceof Money) return (Money) source; Sum sum = (Sum) source;
		 */
		return source.reduce(this, currency);
	}

	public void addRate(String from, String to, int rate) {
		rateMap.put(new Pair(from, to), rate);
	}

	public int rate(String from, String to) {
		if (from.equals(to)) {
			return 1;
		}
		return rateMap.get(new Pair(from, to));
	}

}
