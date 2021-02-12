package Ejer_Herencia_Almacen;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Almacen a=new Almacen("Juanf");
		System.out.println("Nombre del almacen: " + a.getNombre_almacen() + "\n");
			
		// CALCULAR PRECIO TOTAL BEBIDAS
		System.out.println("El precio total de las bebidas es: " + a.precio_todos() + "\n") ; // no calcula bien???
		
		
		//CALCULAR EL PRECIO TOTAL DE UNA MARCA
		System.out.println("Introduce una marca");
		String marca;
		Scanner leer=new Scanner(System.in);
		marca=leer.nextLine();
		System.out.println("El precio total de esa marca es: " + a.precio_marca(marca) + "\n");
		
	
		//CALCULAR PRECIO TOTAL DE UNA ESTANTERIA (columna)
		System.out.println("Introduce un numero de estanteria");
		int estanteria;
		Scanner leerInt=new Scanner(System.in);
		estanteria=leerInt.nextInt();
		System.out.println("El precio total de esa estanteria es: " + a.precio_estanteria(estanteria) + "\n");
		
		
		//AGREGAR PRODUCTO y COMPROBAR Q ID NO ESTE REPETIDO
		System.out.println("Que tipo de producto quieres anadir? Agua o bebida azucarada?");
		String anadir,id, manantial,prom;
		double litros,precio,porc_azucar;
		boolean promocion=true;
	
		
		Scanner leer_anadir=new Scanner(System.in);
		anadir=leer_anadir.nextLine();
		
		if (anadir.equalsIgnoreCase("agua")) {
			System.out.println("Introduce codigo");
			id=leer.nextLine();
			
			if (a.comprobar_id(id)) {
				System.out.println("Introduce los litros");
				litros=leer.nextInt();
				System.out.println("Escribe la marca");
				Scanner leer_=new Scanner(System.in);
				marca=leer_anadir.nextLine();
				System.out.println("Su precio");
				precio=leer.nextInt();
				System.out.println("Escribe el nombre del manantial");
				manantial=leer_anadir.nextLine();
						
				Agua agua2 = new Agua(id, litros, marca, precio, manantial);
					a.agregar_producto(agua2);
				
			}else {
				System.out.println("Producto repetido");
			}
			
		}else {
			
			System.out.println("Introduce codigo");
			id=leer.nextLine();
			
			if(a.comprobar_id(id)) {
				
				System.out.println("Introduce:litros,marca,precio,porcentaje de azucar y si esta en promocion");
				litros=leer.nextInt();
				marca=leer_anadir.nextLine();
				precio=leer.nextInt();
				porc_azucar=leer.nextInt();
				prom=leer_anadir.nextLine();
				
				if (prom.equalsIgnoreCase("si")) {
					promocion= true;
					
				}else {
					promocion= false;
				}
		
				Azucarada azu2 = new Azucarada(id, litros, marca, precio, porc_azucar, promocion);
				a.agregar_producto(azu2);
			}		
		}
		
		
		//MOSTRAR TODOS LOS PRODUCTOS
		System.out.println("El inventario de tu almacen es: \n");
		a.mostrar_todo();  //xq m rellena todo de lo mismo? esta bien lo de super.toString (clase o almacen?)? 
		
		
		//ELIMINAR PRODUCTO
		
		System.out.println("Que producto de la lista quieres eliminar? Introduce su id");
		String idn;
		Scanner leer_id=new Scanner(System.in);
		idn=leer_id.nextLine();
		
		a.eliminar(idn);
		
		a.mostrar_todo();
	
		
	}

}
