package com.johnny.strutturali.Pizza_DE;

public class PizzaBase implements PizzaInterface {

	@Override
	public String getIngredienti() {
		return "Impasto per pizza";
	}

	@Override
	public double getPrezzo() {
		return 2.50;
	}

}
