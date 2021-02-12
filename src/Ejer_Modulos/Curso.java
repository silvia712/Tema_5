package Ejer_Modulos;

import java.util.Arrays;
import java.util.Scanner;

public class Curso {

	private String nombre;
	private String tutor;
	private Modulo vModulos[];
	
	
	public Curso(String nombre, String tutor) {
		this.nombre = nombre;
		this.tutor = tutor;
		this.vModulos = new Modulo [10];
	}


	public Modulo[] getvModulos() {
		return vModulos;
	}


	public void setvModulos(Modulo[] vModulos) {
		this.vModulos = vModulos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTutor() {
		return tutor;
	}


	public void setTutor(String tutor) {
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return "Curso :" + nombre + "    Tutor :" + tutor ;
	}
	
	
	public void anadir_modulo() {
		
		String nombre_modulo;
		String codigo_modulo;
		int horas_modulo;
		
		Scanner leer=new Scanner (System.in);
		
		
		System.out.println("Escribe el nombre del modulo");
		nombre_modulo=leer.nextLine();
		System.out.println("Escribe el codigo del modulo");
		codigo_modulo=leer.nextLine();
		System.out.println("Escribe el numero de horas del modulo");
		horas_modulo=leer.nextInt();
		
		for (int i=0; i<vModulos.length;i++) {
			if (vModulos[i]==null) {
				vModulos[i]=new Modulo(nombre_modulo, codigo_modulo, horas_modulo);	
				}	
			}		
		}
		
	
	public void ver_todos() {
		
		for (Modulo m : vModulos) {
			if (m !=null) {
				System.out.println(m.getNombre());
			}
			
		} 
		
		
	}
	
	
	public int total_horas() {
		
		int total_horas=0;
		
		for (Modulo m : vModulos) {
			if (m!=null) {
				total_horas+=m.getHoras();
			}
		}
		return total_horas;
	}
	
}
