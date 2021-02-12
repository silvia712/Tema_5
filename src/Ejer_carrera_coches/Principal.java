package Ejer_carrera_coches;

import java.util.Random;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		
			
		//Configurar carrera
		Carrera c=new Carrera("*** GRAND PRIX 1 DAW", 350);
		System.out.println(c.getNombre_carrera()+ "\n");
		
		
		//Anadir piloto a la carrera
		System.out.println("Para inscribirte a la carrera \nnecesitamos tu nombre y un numero de dorsal");
		
		String nombre;
		int dorsal;
		
		Scanner leer_nombre=new Scanner(System.in);
		Scanner leer_dorsal=new Scanner (System.in);
		nombre=leer_nombre.nextLine();
		dorsal=leer_dorsal.nextInt();
			
		while(c.comprobar_dorsal(dorsal) == false) {
			System.out.println("Dorsal ya asignado. Elige otro numero\n");
			dorsal=leer_dorsal.nextInt();
		}
		
		System.out.println("Bienvenido a la carrera!\n");
		Coche participante1= new Coche(nombre, dorsal, "zzzzz", c.getDistanciaCarrera(),true);
		c.anadir_participante(participante1);
		
		 
		//COMIENZO CARRERA
		System.out.println("Comienza la carrera !!!\n");
		System.out.println("Pulsa el numero correspondiente para");
		c.menu();
	
	
		
		do {
			//Iniciar acciones con un coche
			for (int i=0; i< c.getvCoches().length;i++) {
				Coche participante = c.getvCoches()[i];
				//Menu de opciones y Mostrar el estado del coche en carrera

				if (participante.isHumano()) {
					c.menu();
					
					Scanner leer_opcion=new Scanner(System.in);
					int opcion;			
					opcion=leer_opcion.nextInt();
					
					switch (opcion) {
					
						case 1:
							participante1.arrancar();
							System.out.println(participante1.getEstado() + "  "+ participante1.getVelocidad() + "km/h  " 
							+ participante1.getKm_recorridos());
							break;
						
						case 2:
							participante1.acelerar();
							System.out.println(participante1.getEstado() + "  "+ participante1.getVelocidad() + "km/h  " 
							+ participante1.getKm_recorridos());
							break;	
						
						case 3:
							participante1.frenar();
							System.out.println(participante1.getEstado() + "  "+ participante1.getVelocidad() + "km/h  " 
							+ participante1.getKm_recorridos());
							break;
					
						case 4:
							participante1.rearrancar();
							System.out.println(participante.getEstado() + "  "+ participante1.getVelocidad() + "km/h  " 
							+ participante1.getKm_recorridos());
							break;
				
						}
				}else {
					
					int opc;
					Random az=new Random();
					opc=az.nextInt(4);
										
					switch (opc) {
					
						case 1:
							participante.arrancar();
							System.out.println(participante.getEstado() + "  "+ participante.getVelocidad() + "km/h  " 
							+ participante.getKm_recorridos());
							break;
						
						case 2:
							participante.acelerar();
							System.out.println(participante.getEstado() + "  "+ participante.getVelocidad() + "km/h  " 
							+ participante.getKm_recorridos());
							break;	
						
						case 3:
							participante.frenar();
							System.out.println(participante.getEstado() + "  "+ participante.getVelocidad() + "km/h  " 
							+ participante.getKm_recorridos());
							break;
					
						case 4:
							participante.rearrancar();
							System.out.println(participante.getEstado() + "  "+ participante.getVelocidad() + "km/h  " 
							+ participante.getKm_recorridos());
							break;
				
						}
					
				}
				
			
			}
			
			//Jugamos y volvemos al punto 1
		} while (c.carreraTerminada()==false);
		
		System.out.println("Partida terminada");
		
			}
			
			
		}

	
			

		
		
		
		
		
	


