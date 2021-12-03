package com.johnny.strutturali.Pizza_DE.client;

import com.johnny.strutturali.Pizza_DE.PizzaBase;
import com.johnny.strutturali.Pizza_DE.PizzaInterface;
import com.johnny.strutturali.Pizza_DE.decorator.Funghi;
import com.johnny.strutturali.Pizza_DE.decorator.Mozzarella;
import com.johnny.strutturali.Pizza_DE.decorator.Nduja;
import com.johnny.strutturali.Pizza_DE.decorator.Salame;

public class Main {

	public static void main(String[] args) {
		PizzaInterface pizza = new Nduja(new Salame(new Mozzarella(new PizzaBase())));
		System.out.println(pizza.getIngredienti() + " -> " + pizza.getPrezzo());
	}

}
