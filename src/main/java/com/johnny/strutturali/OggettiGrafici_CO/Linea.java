package com.johnny.strutturali.OggettiGrafici_CO;

public class Linea extends OggettoGrafico {
	
	public class Punto {
		
		private int x;
		private int y;
		
		public Punto() {
			this.x = 0;
			this.y = 0;
		}
		
		public Punto(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return this.x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return this.y;
		}

		public void setY(int y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Punto [x=" + x + ", y=" + y + "]";
		}
	}
	
	private Punto punto1;
	private Punto punto2;
	
	public Linea() {
		this.punto1 = new Punto();
		this.punto1 = new Punto();
	}
	
	public Linea(Punto punto1, Punto punto2) {
		this.punto1 = punto1;
		this.punto2 = punto2;
	}

	@Override
	public void disegna(MyPanel panel) {
		panel.disegnaLinea(this);
	}

	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}

	@Override
	public String toString() {
		return "Linea [punto1=" + punto1.toString() + ", punto2=" + punto2.toString() + "]";
	}
}
