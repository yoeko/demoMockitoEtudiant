package service;

import java.util.List;

import metier.Etudiant;
import metier.Personne;
/**
 * 
 * @author y
 * Interface IEtudiant Service
 */
public interface IEtudiantService {
	
	public void creerEtudiant(Etudiant etudiant);
	public void modifierEtudiant(Etudiant etudiant);
	public List<Etudiant> listerEtudiant();
	public Etudiant afficherEtudiant(int id);
	public void modifierEtudiant(int personneId, Etudiant etudiant);
	public void supprimerEtudiant(int etudiant_id);
	public Etudiant getById(int etudiant_id);	
	
}
