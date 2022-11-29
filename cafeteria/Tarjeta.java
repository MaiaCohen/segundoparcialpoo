package cafeteria;

public class Tarjeta {
	private int numero;
	private int codseguridad;
	
	public Tarjeta(int numero, int codseguridad) {
		super();
		this.numero = numero;
		this.codseguridad = codseguridad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodseguridad() {
		return codseguridad;
	}

	public void setCodseguridad(int codseguridad) {
		this.codseguridad = codseguridad;
	}

	@Override
	public String toString() {
		return "Tarjeta [numero=" + numero + ", codseguridad=" + codseguridad + "]";
	}
	
	
}
