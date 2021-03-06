package com.johnny.strutturali.Pizza_DE.decorator;

import com.johnny.strutturali.Pizza_DE.PizzaInterface;

public class Salame extends DecoratorePizza {

	public Salame(PizzaInterface pizza) {
		super(pizza);
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + " salame";
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return pizza.getPrezzo() + 1;
	}

}
