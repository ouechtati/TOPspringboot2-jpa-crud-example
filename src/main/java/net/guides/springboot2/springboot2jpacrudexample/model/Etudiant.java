package net.guides.springboot2.springboot2jpacrudexample.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etudiants")

public class Etudiant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_etudiant;
	
	private String firstName_etudiant;
	private String lastName_etudiant;
	private String emailId_etudiant;
	public long getId_etudiant() {
		return id_etudiant;
	}
	public void setId_etudiant(long id_etudiant) {
		this.id_etudiant = id_etudiant;
	}
	public String getFirstName_etudiant() {
		return firstName_etudiant;
	}
	public void setFirstName_etudiant(String firstName_etudiant) {
		this.firstName_etudiant = firstName_etudiant;
	}
	public String getLastName_etudiant() {
		return lastName_etudiant;
	}
	public void setLastName_etudiant(String lastName_etudiant) {
		this.lastName_etudiant = lastName_etudiant;
	}
	public String getEmailId_etudiant() {
		return emailId_etudiant;
	}
	public void setEmailId_etudiant(String emailId_etudiant) {
		this.emailId_etudiant = emailId_etudiant;
	}
	
	
}
