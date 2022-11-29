package cafeteria;

public class Cafe {
	private int id;
	private String tipo;
	private double precio;
	public Cafe(int id, String tipo, double precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "CAFE: " + tipo + "\n Precio: " + precio + " \n" + "  \n" ;
	}
	
	
}
