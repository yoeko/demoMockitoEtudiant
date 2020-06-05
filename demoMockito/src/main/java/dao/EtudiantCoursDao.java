package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EtudiantCoursDao {
	
	static String url = "jdbc:mysql://localhost/my_ecole";
	static String login = "root";
	public static String password = "";

	static Connection cn = null;
	static Statement st = null;
	static ResultSet rs = null;
	
	public void saveEtudiantCours(int etudiantId, int coursId) {
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "INSERT INTO `etudiantCours` (`idCours`, `idEtudiant`) " + "VALUES ('" + coursId + "', '" + etudiantId  + "')";

			// etape 4 executer la requette
			st.executeUpdate(sql);
			System.out.println("Etudiant affet� avec succ�s !!!! ");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {

			// etape 5 liberer les ressources
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
