package Ejer_Herencia_Productos;

import java.util.Scanner;

public class Producto {

	protected String nombre;
	protected double precio;
	
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
	public double calcular (int cantidad) {
		
		double total=0;
		
		total=cantidad*getPrecio();
		
		return total;
	}
	
	
}
		
	
	

