package Ejer_Herencia_Almacen;


public abstract class Bebida {

	protected String id;
	protected double litros;
	protected String marca;
	protected double precio;
	
	
	public Bebida(String id, double litros, String marca, double precio) {
		this.id = id;
		this.litros = litros;
		this.marca = marca;
		this.precio = precio;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Bebida [id=" + id + ", litros=" + litros + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
