package com.johnny.strutturali.Pizza_DE.decorator;

import com.johnny.strutturali.Pizza_DE.PizzaInterface;

public class Nduja extends DecoratorePizza {

	public Nduja(PizzaInterface pizza) {
		super(pizza);
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + " nduja";
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return pizza.getPrezzo() + 1.50;
	}

}
