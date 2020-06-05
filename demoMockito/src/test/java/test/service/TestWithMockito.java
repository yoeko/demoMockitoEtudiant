package test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import dao.EtudiantDao;
import metier.Etudiant;
import service.EtudiantService;


public class TestWithMockito {
	
	@Test
	public void testReadEtudiant() {
		
		
		// 1- Mocker l'interface du dao	
		EtudiantDao etudiantDao = Mockito.mock(EtudiantDao.class);
		
		// 2- Creation du service
		EtudiantService etudiantService = new EtudiantService(etudiantDao);
		
		// 3- Imposer le comportement au mock dao
		Mockito.when(etudiantDao.afficherEtudiant(3)).thenReturn(new Etudiant(1, 1, "klu", "yoeko", "paris", "5625", "ds", "1222"));
		
		// 3a- Appeler une methode du service
		Etudiant etudiantRetour = etudiantService.afficherEtudiant(3);
		
		// 4- 
		System.out.println(etudiantRetour);
		Assertions.assertEquals(1, etudiantRetour.getId());
		Mockito.verify(etudiantDao).afficherEtudiant(3);
	
	
		
	}

}
