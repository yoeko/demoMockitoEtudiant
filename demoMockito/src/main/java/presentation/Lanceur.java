package presentation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import metier.Cours;
import metier.Etudiant;
import metier.Personne;
import service.Argon2PasswordEncoder;
import service.CoursService;
import service.EtudiantCoursService;
import service.EtudiantService;
import service.PersonneService;

/**
 * 
 * @author y
 * 
 * Point de depart de notre application
 *
 */
public class Lanceur {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue dans SoftSchool");
	}


}
