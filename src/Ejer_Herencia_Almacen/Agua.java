package Ejer_Herencia_Almacen;

import Ejer_Herencia_Almacen.Bebida;

public final class Agua extends Bebida{

	private String manantial;

	public Agua(String id, double litros, String marca, double precio, String manantial) {
		super(id, litros, marca, precio);
		this.manantial = manantial;
	}

	public String getManantial() {
		return manantial;
	}

	public void setManantial(String manantial) {
		this.manantial = manantial;
	}

	@Override
	public String toString() {
		return "Agua manantial=" + manantial + super.toString();
	}
	
	
}
