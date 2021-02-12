package Ejer_Herencia_Productos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
	Producto vProductos[]=new Producto[10];
		
		vProductos[0]=new Perecedero("huevos",3.25,1); // 1 dia reduce 4 veces
		vProductos[1]=new Perecedero("leche",1.5,2); // 2 dias reduce 3 veces
		vProductos[2]=new Perecedero("galletas",2.5,3); // 3 dias reduce a la mitad
		vProductos[3]=new Perecedero("chocolate",0.75,4); // 4 dias no descuento
		vProductos[4]=new Imperecedero("cepillo",3.5,"limpieza");
		vProductos[5]=new Imperecedero("fregona",4.75,"limpieza");
	
		
		Scanner leer=new Scanner(System.in);
		int cantidad=0;
			
		System.out.println("Cantidad de articulos");
		cantidad=leer.nextInt();
		
		
		for (Producto p : vProductos) {
			if (p!=null) {
				System.out.println(p.getNombre() + " " + p.calcular(cantidad) + "€");
			}
			
		}

	}

}
