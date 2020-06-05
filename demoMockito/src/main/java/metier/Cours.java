package metier;

/**
 * 
 * @author y
 *
 *	Classe Cours
 */
public class Cours {
	

	private int idCours;
	private String theme;
	private int nbHeure;
	
	/**
	 * Constructeur Cours
	 * 
	 * @param idCours
	 * @param theme
	 * @param nbHeure
	 */
	public Cours(int idCours, String theme, int nbHeure) {
		super();
		this.idCours = idCours;
		this.theme = theme;
		this.nbHeure = nbHeure;
	}
	
	public int getIdCours() {
		return idCours;
	}

	public void setIdCours(int idCours) {
		this.idCours = idCours;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public int getNbHeure() {
		return nbHeure;
	}

	public void setNbHeure(int nbHeure) {
		this.nbHeure = nbHeure;
	}
	
	@Override
	public String toString() {
		return "Cours [idCours=" + idCours + ", theme=" + theme + ", nbHeure=" + nbHeure + "]";
	}
	
}
