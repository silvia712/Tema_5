package Ejer_Herencia_Almacen;

import java.util.Arrays;

public class Almacen {

	private String nombre_almacen;
	private Bebida mBebida[][];

	public Almacen(String nombre_almacen) {
		this.nombre_almacen = nombre_almacen;
		this.mBebida = mBebida;

		mBebida = new Bebida[5][5]; // matriz --> estanterias del almacen

		mBebida[0][0] = new Agua("a45", 10, "Lanjaron", 10, "Granada");
		mBebida[2][4] = new Azucarada("b38", 20, "cola", 20, 60, false);
		mBebida[3][2] = new Azucarada("c64", 30, "fanta", 10, 30, true); // 10% dto
	}

	public String getNombre_almacen() {
		return nombre_almacen;
	}

	public void setNombre_almacen(String nombre_almacen) {
		this.nombre_almacen = nombre_almacen;
	}

	public Bebida[][] getmBebida() {
		return mBebida;
	}

	public void setmBebida(Bebida[][] mBebida) {
		this.mBebida = mBebida;
	}

	@Override
	public String toString() {
		return "Almacen [nombre_almacen=" + nombre_almacen + ", mBebida=" + Arrays.toString(mBebida) + "]";
	}

	public double precio_todos() {

		double precio_todos = 0;

		for (int i = 0; i < mBebida.length; i++) {
			for (int j = 0; j < mBebida[i].length; j++) {
				if (mBebida[i][j] != null) {
					precio_todos += mBebida[i][j].getPrecio();
				}
			}
		}
		return precio_todos;
	}

	public double precio_marca(String marca) {

		double precio_marca = 0;

		for (int i = 0; i < mBebida.length; i++) {
			for (int j = 0; j < mBebida[i].length; j++) {
				if (mBebida[i][j] != null && mBebida[i][j].getMarca().equalsIgnoreCase(marca)) {
					precio_marca += mBebida[i][j].getPrecio();
				}
			}
		}
		return precio_marca;
	}

	public double precio_estanteria(int estanteria) {

		double precio_estanteria = 0;

		for (int i = 0; i < mBebida.length; i++) {
			if (mBebida[i][estanteria] != null) {
				precio_estanteria += mBebida[i][estanteria].getPrecio();
			}
		}
		return precio_estanteria;
	}

	public String agregar_producto(Bebida anadir) {

		for (int i = 0; i < mBebida.length; i++) {
			for (int j = 0; j < mBebida[i].length; j++) {
				if (mBebida[i][j] == null ) {
					mBebida[i][j] = anadir;
					break;
				}
			}
		}
		return "producto anadido"; // no sale en ningun sitio???
	}

	//Devuelvo True si podemos guardar, false si el id esta repetido
	public boolean comprobar_id(String id) {

		for (int i = 0; i < mBebida.length; i++) {
			for (int j = 0; j < mBebida[i].length; j++) {
				if ((mBebida[i][j] !=null) && (id.equalsIgnoreCase(mBebida[i][j].getId()))) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public void mostrar_todo() {
		
		for (int i = 0; i < mBebida.length; i++) {
			for (int j = 0; j < mBebida[i].length; j++) {
				if (mBebida[i][j]!=null) {
					System.out.println((mBebida[i][j])); 
				}
			}
		}
	}
	
	public void eliminar(String idn) {  // idn el identificador q llega desde main. id el de la clase
		
		for(int i=0;i<mBebida.length;i++) {
			for(int j=0;j<mBebida.length;j++) {
				if( (mBebida[i][j] !=null) && (idn.equalsIgnoreCase(mBebida[i][j].getId()))) {
					mBebida[i][j]=null; 
				}
			}
		}
	}
	
}
