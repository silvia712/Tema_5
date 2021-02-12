package Ejer_Herencia_Almacen;

import Ejer_Herencia_Almacen.Bebida;

public final class Azucarada extends Bebida {

	private double porc_azucar;
	private boolean promocion;
	
	public Azucarada(String id, double litros, String marca, double precio, double porc_azucar, boolean promocion) {
		super(id, litros, marca, precio);
		this.porc_azucar = porc_azucar;
		this.promocion = promocion;
	}

	public double getPorc_azucar() {
		return porc_azucar;
	}

	public void setPorc_azucar(double porc_azucar) {
		this.porc_azucar = porc_azucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	@Override
	public String toString() {
		return "Azucarada porc_azucar=" + porc_azucar + ", promocion=" + promocion + super.toString();
	}
	
	@Override
	public double getPrecio() {				// para calcular el descuento del 10%. Mi padre tiene el precio
											// llamo al metodo de mi padre y opero
		double descuento=0;
		
		if (this.promocion) {
			return descuento=super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
	}
	
	
}
