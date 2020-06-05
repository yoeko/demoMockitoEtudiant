package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import metier.Etudiant;
import metier.Personne;

public class PersonneDao {
	
	static String url = "jdbc:mysql://localhost/my_ecole";
	static String login = "root";
	public static String password = "";

	static Connection cn = null;
	static Statement st = null;
	static ResultSet rs = null;
	
	public int creerPersonne(Personne personne) {
		int generatedKey = 0;
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "INSERT INTO `personne` (`nom`, `prenom`,`email`, "
					+ "`adresse`,`telephone`) " + "VALUES ('" + personne.getNom() + "','"
					+ personne.getPrenom() + "', '" + personne.getEmail() + "', '" + personne.getAdress() + "', '"
					+ personne.getTelephone() + "')";

			// etape 4 executer la requette
			st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = st.getGeneratedKeys();
			if (st.getGeneratedKeys().next()) {
				generatedKey = rs.getInt(1);
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
		return generatedKey;
	}
	
	public int updatePersonne(Personne personne) {
		int generatedKey = 0;
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "UPDATE `personne`"
					+ "SET nom = '" + personne.getNom() + "',"
					+ "prenom = '" + personne.getPrenom() + "',"
					+ "email = '" + personne.getEmail() + "',"
					+ "adresse = '" + personne.getAdress() + "',"
					+ "telephone = '" + personne.getTelephone() + "'"
					+ "WHERE id = '" + personne.getId() + "'";

			// etape 4 executer la requette
			st.executeUpdate(sql, st.RETURN_GENERATED_KEYS);
			ResultSet rs = st.getGeneratedKeys();
			if (st.getGeneratedKeys().next()) {
				generatedKey = rs.getInt(1);
			}
//			
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
		return generatedKey;
		
	}
	
	public Personne getPersonneToUpdateViaEtudiant(int etudiant_id) {
		Personne personne = new Personne(null, null, null, null, null);
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "select * from personne, etudiant where personne.id=etudiant.personne_id and etudiant.id="+ etudiant_id + ";";

			// etape 4 executer la requette
			rs = st.executeQuery(sql);	
			while (rs.next()) {
				personne = new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("adresse"), rs.getString("telephone"));				
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

		return personne;
	}

	
}
