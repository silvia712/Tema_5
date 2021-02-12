package Ejer_Modulos;

import java.util.Scanner;

public class Modulo_principal {

	public static int pinta_menu() {
		
		int opcion=0;
		
		do {
			System.out.println(" --- MENU --- ");
			System.out.println("1 - Añadir Modulo ");
			System.out.println("2 - Ver todos ");
			System.out.println("3 - Ver horas curso ");
			System.out.println("4 - Salir ");
		
				Scanner leer=new Scanner (System.in);
				opcion=leer.nextInt();
				
				if (opcion<1 || opcion>4) {
					System.out.println("Opcion incorrecta (de 1 a 4)\n");
				}
				
			}while (opcion<1 || opcion>4);
		
		return opcion;
	}
	
	
	public static void main(String[] args) {
		
		int opcion=0;
		
		Curso c=new Curso(" DAW 1", " Jose Micolau");
		System.out.println(c.toString() + "\n");
		
			do {
			
				switch (pinta_menu()) {
			
					case 1:
						c.anadir_modulo();
						break;
	
					case 2:
						c.ver_todos();
						break;
	
					case 3:
						System.out.println(c.total_horas());
						break;
					
					case 4:
						System.out.println("Adios!");
						break;
				}
		
			} while (opcion!=4);
	
	
		
		
		
	}

}
