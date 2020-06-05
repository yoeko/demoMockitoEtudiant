package service;

import dao.EtudiantCoursDao;

/**
 * 
 * @author y
 *
 */
public class EtudiantCoursService implements IEtudiantCoursService {

	public void creerEtudiantCours(int etudiantId, int coursId) {
		new EtudiantCoursDao().saveEtudiantCours(etudiantId, coursId);		
	}

}
