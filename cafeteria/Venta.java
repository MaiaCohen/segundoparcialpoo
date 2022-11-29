package cafeteria;

public class Venta {
	Cafe cafe;
	Venta venta;
	Tarjeta tarjeta;
	private int cant;
	public Venta(Cafe cafe, Venta venta, Tarjeta tarjeta, int cant) {
		super();
		this.cafe = cafe;
		this.venta = venta;
		this.tarjeta = tarjeta;
		this.cant = cant;
	}
	public Cafe getCafe() {
		return cafe;
	}
	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	@Override
	public String toString() {
		return "Venta [cafe=" + cafe + ", venta=" + venta + ", tarjeta=" + tarjeta + ", cant=" + cant + "]";
	}
	
	
}