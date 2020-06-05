package service;

import java.util.List;

import dao.EtudiantDao;
import dao.PersonneDao;
import metier.Etudiant;
import metier.Personne;

/**
 * 
 * @author y
 *
 */
public class EtudiantService implements IEtudiantService {
	
	private EtudiantDao etudiantDao;

	public EtudiantService(EtudiantDao etudiantDao) {
		super();
		this.etudiantDao = etudiantDao;
	}

	public void creerEtudiant(Etudiant etudiant) {
		int personneId = 0;
		personneId = new PersonneService().creerPersonne(etudiant);
		if (personneId==0) {
			System.out.println("Un probleme est survenu veuillez ressayez cet enregistrement");
		}else {
			new EtudiantDao().creerEtudiant(personneId, etudiant);
		}
		
	}

	public void modifierEtudiant(int personneId, Etudiant etudiant) {
		new EtudiantDao().modifierEtudiant(personneId, etudiant);		
	}

	public void supprimerEtudiant(int etudiant_id) {
		new EtudiantDao().deleteEtudiant(etudiant_id);		
	}

	public List<Etudiant> listerEtudiant() {
		return new EtudiantDao().listerEtudiant();		
	}
	
	public Etudiant afficherEtudiant(int id) {
		return etudiantDao.afficherEtudiant(id);
	}

	public void modifierEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		
	}

	public Etudiant getById(int etudiant_id) {
		return new EtudiantDao().getById(etudiant_id);
	}
	
	
}
