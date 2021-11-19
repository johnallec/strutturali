package com.johnny.strutturali.Pizza_DE.decorator;

import com.johnny.strutturali.Pizza_DE.PizzaInterface;

public abstract class DecoratorePizza implements PizzaInterface {

	protected PizzaInterface pizza;
	
	public DecoratorePizza(PizzaInterface pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String getIngredienti() {
		return pizza.getIngredienti();
	}

	@Override
	public double getPrezzo() {
		return pizza.getPrezzo();
	}

}
