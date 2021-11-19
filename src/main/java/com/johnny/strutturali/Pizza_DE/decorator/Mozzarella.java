package com.johnny.strutturali.Pizza_DE.decorator;

import com.johnny.strutturali.Pizza_DE.PizzaInterface;

public class Mozzarella extends DecoratorePizza {

	public Mozzarella(PizzaInterface pizza) {
		super(pizza);
	}

	@Override
	public String getIngredienti() {
		return pizza.getIngredienti() + " mozzarella";
	}

	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return super.getPrezzo() + 0.50;
	}

}
