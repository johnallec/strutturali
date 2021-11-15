package com.johnny.strutturali.DisegnaForme_AD;

public class Cerchio implements Figura{

	private double raggio;
	private double area;
	private double perimetro;
	
	@Override
	public double getArea() {
		this.area = this.raggio * this.raggio * 3.14;
		return this.area;
	}

	@Override
	public double getPerimetro() {
		this.perimetro = 2*3.14*this.raggio;
		return this.perimetro;
	}

	@Override
	public Figura getFigura() {
		return this;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	@Override
	public String toString() {
		return "Cerchio [raggio=" + raggio + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
}
