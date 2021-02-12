package Ejer_Herencia_Productos;

import java.util.Scanner;

public final class Imperecedero extends Producto{

	private String tipo;

	public Imperecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Imperecedero [tipo=" + tipo + "]";
	}

	
}
