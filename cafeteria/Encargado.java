package cafeteria;

public class Encargado {
	private String nom;
	private int id;
	private int contrase�a;
	
	public Encargado(String nom, int id, int contrase�a) {
		super();
		this.nom = nom;
		this.id = 1;
		this.contrase�a = 2;
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

	public int getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(int contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Encargado [nom=" + nom + ", id=" + id + ", contrase�a=" + contrase�a + "]";
	}
	
	
}
