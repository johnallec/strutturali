package com.johnny.strutturali.DisegnaForme_AD;

public class Quadrato implements Figura{

	private double lato;
	private double area;
	private double perimetro;
	
	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	@Override
	public double getArea() {
		this.area = lato*lato;
		return this.area;
	}

	@Override
	public double getPerimetro() {
		this.perimetro = lato*4;
		return this.perimetro;
	}

	@Override
	public Figura getFigura() {
		getArea();
		getPerimetro();
		return this;
	}

}
