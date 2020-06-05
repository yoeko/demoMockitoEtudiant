package service;

import dao.CoursDao;
import metier.Cours;

/**
 * 
 * @author y
 *
 */
public class CoursService implements ICoursService {

	public Cours getById(int cours_id) {
		return new CoursDao().getById(cours_id);
	}
	
}
