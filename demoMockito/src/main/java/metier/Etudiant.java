package metier;

import java.util.Date;

/**
 * 
 * @author y
 *
 */
public class Etudiant extends Personne {

	private int id;
	private String dateNaissance;


	/**
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adress
	 * @param telephone
	 * @param dateNaissance
	 */
	public Etudiant(String nom, String prenom, String email, String adress, String telephone, String dateNaissance) {
		super(nom, prenom, email, adress, telephone);
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @param id
	 * @param personne_id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adress
	 * @param telephone
	 * @param dateNaissance
	 */
	public Etudiant(int id,int personne_id , String nom, String prenom, String email, String adress, String telephone,
			String dateNaissance) {
		super(personne_id, nom, prenom, email, adress, telephone);
		this.dateNaissance = dateNaissance;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + this.getNom() + ", prenom=" + this.getPrenom() + ", email=" + this.getEmail() + ", adress=" + this.getAdress()
				+ ", telephone=" + this.getTelephone() + ", dateNaissance=" + dateNaissance + "]";
	}

}
