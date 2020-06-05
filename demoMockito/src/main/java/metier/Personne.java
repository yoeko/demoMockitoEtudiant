package metier;

public class Personne {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String adress;
	private String telephone;
		
	/**
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adress
	 * @param telephone
	 */
	public Personne(int id, String nom, String prenom, String email, String adress, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adress = adress;
		this.telephone = telephone;
	}
	
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adress
	 * @param telephone
	 */
	public Personne(String nom, String prenom, String email, String adress, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adress = adress;
		this.telephone = telephone;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", adress=" + adress
				+ ", telephone=" + telephone + "]";
	}
	
	

}
