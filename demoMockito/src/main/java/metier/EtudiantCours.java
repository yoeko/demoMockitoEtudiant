package metier;

/**
 * 
 * @author y
 * 
 * Class EtudiantCours
 *
 */
public class EtudiantCours {
	
	private int id;
	private int idCours;
	private int idEtudiant;
	
	/**
	 * @param id
	 * @param idCours
	 * @param idEtudiant
	 */
	public EtudiantCours(int id, int idCours, int idEtudiant) {
		super();
		this.id = id;
		this.idCours = idCours;
		this.idEtudiant = idEtudiant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}

	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	
}
