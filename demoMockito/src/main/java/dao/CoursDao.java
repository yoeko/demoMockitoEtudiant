package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import metier.Cours;
import metier.Etudiant;

public class CoursDao {
	
	// information de la base de donnee
	static String url = "jdbc:mysql://localhost/my_ecole";
	static String login = "root";
	public static String password = "";

	static Connection cn = null;
	static Statement st = null;
	static ResultSet rs = null;
	
	public Cours getById(int cours_id) {
		Cours cours = null;
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "select * from cours where idCours="+ cours_id ;

			// etape 4 executer la requette
			rs = st.executeQuery(sql);	
			while (rs.next()) {
				cours = new Cours(rs.getInt("idCours"), rs.getString("theme"), rs.getInt("nombreHeure"));
				
			}
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

		return cours;
	}
	
}
