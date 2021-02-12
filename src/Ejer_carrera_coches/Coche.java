package Ejer_carrera_coches;

import java.util.Random;

public class Coche {

	private String piloto;
	private int dorsal;
	private String escuderia;
	private double distanciaCarrera;
	private final int POTENCIA=50;
	private double velocidad;
	private double km_recorridos;
	private String estado;
	private boolean humano;
	
	public Coche(String piloto, int dorsal, String escuderia, double distancia) {
		super();
		this.piloto = piloto;
		this.dorsal = dorsal;
		this.escuderia = escuderia;
		this.distanciaCarrera = distancia;
		this.velocidad = 0;
		this.km_recorridos = 0;
		this.estado= "parado";
		this.humano = false;
	}
	public Coche(String piloto, int dorsal, String escuderia, double distancia, boolean humano) {
		super();
		this.piloto = piloto;
		this.dorsal = dorsal;
		this.escuderia = escuderia;
		this.distanciaCarrera = distancia;
		this.velocidad = 0;
		this.km_recorridos = 0;
		this.estado= "parado";
		this.humano = humano;
	}
	
	public boolean isHumano() {
		return humano;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	
	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public double getDistancia() {
		return distanciaCarrera;
	}

	public void setDistancia(double distancia) {
		this.distanciaCarrera = distancia;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
		if (this.velocidad>200) {
			this.velocidad=0;
			setEstado("accidentado");
		}
		if (this.velocidad<0) {
			this.velocidad=0;
		}
		
	}

	public double getKm_recorridos() {
		return km_recorridos;
	}

	public void setKm_recorridos(double km_recorridos) {
		this.km_recorridos = km_recorridos;
		if (this.km_recorridos>=distanciaCarrera)
			setEstado("finalizado");
	}

	@Override
	public String toString() {
		return "Coche [piloto=" + piloto + ", dorsal=" + dorsal + ", distancia=" + distanciaCarrera + ", velocidad="
				+ velocidad + ", km_recorridos=" + km_recorridos + "]";
	}

	public double getDistanciaCarrera() {
		return distanciaCarrera;
	}

	public void setDistanciaCarrera(double distanciaCarrera) {
		this.distanciaCarrera = distanciaCarrera;
	}

	public String getEstado() {
		return  estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	public void arrancar() {
		if (this.estado.equalsIgnoreCase("parado")) {
			this.estado="marcha";
		}else {
			System.out.println("El coche ya esta arrancado y en marcha");
		}
	}
	
	
	public void rearrancar() {
		if (this.estado.equalsIgnoreCase("accidentado")) {
			this.estado="marcha";
		}else {
			System.out.println("No puedo rearrancar en el estado actual del coche");
		}
	}
	
	public void frenar() {
		
		int frena;
		
		if (this.estado.equalsIgnoreCase("marcha")) {
			Random azar=new Random();
			frena=azar.nextInt(POTENCIA);
			setVelocidad(getVelocidad() - frena);
			setKm_recorridos(getKm_recorridos()+frena/3);
		}
	}
	
	
	public void acelerar() {
		
		int acelera;
		
		if (this.estado.equalsIgnoreCase("marcha")) {
			Random azar=new Random();
			acelera=azar.nextInt(POTENCIA);
			setVelocidad(getVelocidad()+acelera);
			setKm_recorridos(getKm_recorridos()+acelera);	
		}
		
	}
	
		
	
	
	
}
