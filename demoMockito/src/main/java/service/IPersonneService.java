package service;

import metier.Personne;

/**
 * 
 * @author y
 *
 */
public interface IPersonneService {
	
	public int creerPersonne(Personne personne);
	public int modifierPersonne(Personne personne);
	public void supprimerPersonne(Personne personne);
	public void listerPersonne();
	public Personne getPersonneViaEtudiantId(int etudiant_id);

}
