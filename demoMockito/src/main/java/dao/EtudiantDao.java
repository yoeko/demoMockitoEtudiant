package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import metier.Cours;
import metier.Etudiant;
import metier.Personne;

/**
 * 
 * @author y
 *
 */
public class EtudiantDao {
	
	// information de la base de donnee

	static String url = "jdbc:mysql://localhost/my_ecole?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String login = "root";
	public static String password = "";

	static Connection cn = null;
	static Statement st = null;
	static ResultSet rs = null;
	
	public void creerEtudiant(int personneId, Etudiant etudiant) {
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "INSERT INTO `etudiant` (`personne_id`, `date_naissance`) " + "VALUES ('" + personneId + "', '" + etudiant.getDateNaissance() + "')";

			// etape 4 executer la requette
			st.executeUpdate(sql);
			System.out.println("Etudiant enr�gistr� avec succ�s !!!! ");

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
	
	public void modifierEtudiant(int etudiant_id, Etudiant etudiant) {
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "UPDATE `etudiant`"
					+ "SET date_naissance = '" + etudiant.getDateNaissance() + "'"
					+ "WHERE id = '" + etudiant_id + "'";
			
			// etape 4 executer la requette
			st.executeUpdate(sql);
			System.out.println("Etudiant modifi� avec succ�s !!!! ");
			System.out.println();

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
	
	public List<Etudiant> listerEtudiant() {
		List<Etudiant> etudiants = new ArrayList<Etudiant>();
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "select * from personne, etudiant where personne.id=etudiant.personne_id ";

			// etape 4 executer la requette
			System.out.println("Liste des etudiants ");
			rs = st.executeQuery(sql);			
			
			while (rs.next()) {
				Etudiant e = new Etudiant(rs.getInt("id"), rs.getInt("personne_id") , rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("adresse"), rs.getString("telephone"), rs.getString("date_naissance"));
				etudiants.add(e);
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
		return etudiants;
	}
	
	public Etudiant afficherEtudiant(int id) {
		Etudiant etudiant = new Etudiant(null, null, null, null, null, null);
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "select * from personne, etudiant where personne.id=etudiant.personne_id and etudiant.id="+ id + ";";

			// etape 4 executer la requette
			rs = st.executeQuery(sql);
			while (rs.next()) {
				etudiant = new Etudiant(rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("adresse"), rs.getString("telephone"), rs.getString("date_naissance"));				
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

		return etudiant;
	}
	
	public void deleteEtudiant(int etudiant_id) {
		
		try {
			// etape1 chargement du driver

			Class.forName("com.mysql.jdbc.Driver");

			// etape2 recupertion de la connnexion

			cn = DriverManager.getConnection(url, login, password);

			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "DELETE FROM `etudiant` WHERE id = '" + etudiant_id + "'";
			
			// etape 4 executer la requette
			st.executeUpdate(sql);
			System.out.println("Etudiant supprim� avec succ�s !!!! ");
			System.out.println();

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

	public Etudiant getById(int etudiant_id) {
		Etudiant etudiant = null;
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
				etudiant = new Etudiant(rs.getInt("id"), rs.getInt("personne_id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("adresse"), rs.getString("telephone"), rs.getString("date_naissance"));				
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

		return etudiant;
	}

}
