package Ejer_Herencia_Productos;

import java.util.Scanner;


public final class Perecedero extends Producto {
	
		private int dias;

		public Perecedero(String nombre, double precio, int dias) {
			super(nombre, precio);
			this.dias = dias;
		}

		public int getDias() {
			return dias;
		}

		public void setDias(int dias) {
			this.dias = dias;
		}

		@Override
		public String toString() {
			return "Perecedero [dias=" + dias + "]";
		}

		@Override
		public double calcular(int cantidad) {
			
			double precio_total=super.calcular(cantidad);
			
			switch (getDias()) {
			
			case 1:
				precio_total=precio_total/4;
				break;
			
			case 2:
				precio_total=precio_total/3;
				break;	
			
			case 3:
				precio_total=precio_total/2;
				break;

			default:
				precio_total=super.calcular(cantidad);
				break;
			}
			return precio_total;	
			}
			
		
		}


	

