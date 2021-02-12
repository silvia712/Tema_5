package Ejer_carrera_coches;

public class Carrera {

	private String nombre_carrera;
	private double distanciaCarrera;
	private Coche vCoches[];
	
	
	public Carrera(String nombre_carrera, double distanciaCarrera) {    
		this.nombre_carrera = nombre_carrera;
		this.distanciaCarrera=distanciaCarrera;
	
		vCoches=new Coche[10];
		
		vCoches[0]=new Coche("Tomas",54, "Ferrari",distanciaCarrera);
		vCoches[1]=new Coche("Jordi",37,"Maserati",distanciaCarrera);	
		vCoches[2]=new Coche("Diego",81,"Porsche",distanciaCarrera);
		vCoches[3]=new Coche("Angel",15,"Mercedes",distanciaCarrera);
		vCoches[4]=new Coche("Adelin",07,"Lamborghini",distanciaCarrera);
		vCoches[5]=new Coche("Ivan ",22,"Bugatti",distanciaCarrera);
		vCoches[6]=new Coche("Gil  ",54,"BMV",distanciaCarrera);
		vCoches[7]=new Coche("Silvia", 03,"Aston Martin",distanciaCarrera);
	
		
		
	}

	
	public String getNombre_carrera() {
		return nombre_carrera;
	}

	public void setNombre_carrera(String nombre_carrera) {
		this.nombre_carrera = nombre_carrera;
	}
	

	
	public double getDistanciaCarrera() {
		return distanciaCarrera;
	}


	public void setDistanciaCarrera(double distanciaCarrera) {
		this.distanciaCarrera = distanciaCarrera;
	}


	public Coche[] getvCoches() {
		return vCoches;
	}

	public void setvCoches(Coche[] vCoches) {
		this.vCoches = vCoches;
	}

	@Override
	public String toString() {
		return "Carrera [nombre_carrera=" + nombre_carrera + ", vCoches=" + vCoches + "]";
	}
	
	
	//True si puedo entrar en la carrera - Falso si no puedo y esta repetido el dorsal
	public boolean comprobar_dorsal(int dorsal) {
		
		for (int i=0;i<vCoches.length;i++) {
			if ((vCoches[i]!=null) && (dorsal==vCoches[i].getDorsal())) {
				return false;
			}
		}
		return true;
	}
	
	
	public void anadir_participante(Coche participante1) {
		
		for (int i=0;i<vCoches.length;i++) {
			if (vCoches[i]==null) {
				vCoches[i]=participante1;
				break;
			}
		}
	}
		
	
	public void parrilla_salida() {
		for (int i=0;i<vCoches.length;i++) {
			if (vCoches[i]!=null) {
				System.out.println(vCoches[i].getPiloto() + "         " + vCoches[i].getDorsal() 
				+ "         " + vCoches[i].getEscuderia() );
			}
		}	
	}


	public boolean carreraTerminada() {
		for (int i=0; i<vCoches.length;i++) {
			if (vCoches[i].getEstado()=="marcha") {
			return false;	
			}	
		}
		return true;
	}
	
	
	public void menu() {
		
		System.out.println("\n1-Arrancar  2-Acelerar   3-Frenar   4-Rearrancar\n");
	
	}
		
	
	}
		
		
		
	
	
	

