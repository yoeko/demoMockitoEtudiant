package service;

import dao.PersonneDao;
import metier.Personne;

/**
 * 
 * @author y
 *
 */
public class PersonneService implements IPersonneService {


	public int creerPersonne(Personne personne) {
		return new PersonneDao().creerPersonne(personne);
	}


	public int modifierPersonne(Personne personne) {
		return new PersonneDao().updatePersonne(personne);
		
	}
	

	public Personne getPersonneViaEtudiantId(int etudiant_id) {
		return new PersonneDao().getPersonneToUpdateViaEtudiant(etudiant_id);
		
	}


	public void supprimerPersonne(Personne personne) {
		// TODO Auto-generated method stub
		
	}


	public void listerPersonne() {
		// TODO Auto-generated method stub
		
	}
	
	
}
