package cafeteria;

public class Encargado {
	private String nom;
	private int id;
	private int contraseña;
	
	public Encargado(String nom, int id, int contraseña) {
		super();
		this.nom = nom;
		this.id = 1;
		this.contraseña = 2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Encargado [nom=" + nom + ", id=" + id + ", contraseña=" + contraseña + "]";
	}
	
	
}
