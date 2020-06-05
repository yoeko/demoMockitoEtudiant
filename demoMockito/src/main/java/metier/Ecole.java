package metier;

public class Ecole {
	
	private int id;
	private String nom;
	private String email;
	private String adress;
	private String telephone;
	private String directeur;
	
	public Ecole(int id, String nom, String email, String adress, String telephone, String directeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.adress = adress;
		this.telephone = telephone;
		this.directeur = directeur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getDirecteur() {
		return directeur;
	}

	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	
	
	
	
	
}
