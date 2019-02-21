package com.demo.security.jwtsecurity.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Missionaire implements Serializable {
@Id
private String cin ; 
private String matricule ; 
private String nom;
private String nomL;
private String prenom;
private String prenomL;
private String nationalite;
private String nationaliteL;
private Date datenaissance;
private Date date_cin;
private String place_cin;
private String niveau;
private String ministr;
public Missionaire()
{
}


public Missionaire(String cin, String matricule) {
	super();
	this.cin = cin;
	this.matricule = matricule;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cin == null) ? 0 : cin.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Missionaire other = (Missionaire) obj;
	if (cin == null) {
		if (other.cin != null)
			return false;
	} else if (!cin.equals(other.cin))
		return false;
	return true;
}


public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getNomL() {
	return nomL;
}


public Missionaire(String cin, String matricule, String nom, String nomL, String prenom, String prenomL,
		String nationalite, String nationaliteL, Date datenaissance, Date date_cin, String place_cin, String grade,
		String fonction, String niveau, String ministr, com.demo.security.jwtsecurity.model.grade graade,
		com.demo.security.jwtsecurity.model.fonction fonnction, classe classee, Categorie cat, groupe group,
		deptgen dept) {
	super();
	this.cin = cin;
	this.matricule = matricule;
	this.nom = nom;
	this.nomL = nomL;
	this.prenom = prenom;
	this.prenomL = prenomL;
	this.nationalite = nationalite;
	this.nationaliteL = nationaliteL;
	this.datenaissance = datenaissance;
	this.date_cin = date_cin;
	this.place_cin = place_cin;
	
	this.niveau = niveau;
	this.ministr = ministr;
	this.graade = graade;
	this.fonnction = fonnction;
	this.classee = classee;
	this.cat = cat;
	this.group = group;
	this.dept = dept;
}


public void setNomL(String nomL) {
	this.nomL = nomL;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public String getPrenomL() {
	return prenomL;
}


public void setPrenomL(String prenomL) {
	this.prenomL = prenomL;
}


public String getNationalite() {
	return nationalite;
}


public void setNationalite(String nationalite) {
	this.nationalite = nationalite;
}


public String getNationaliteL() {
	return nationaliteL;
}


public void setNationaliteL(String nationaliteL) {
	this.nationaliteL = nationaliteL;
}


public Date getDatenaissance() {
	return datenaissance;
}


public void setDatenaissance(Date datenaissance) {
	this.datenaissance = datenaissance;
}


public Date getDate_cin() {
	return date_cin;
}


public void setDate_cin(Date date_cin) {
	this.date_cin = date_cin;
}


public String getPlace_cin() {
	return place_cin;
}


public void setPlace_cin(String place_cin) {
	this.place_cin = place_cin;
}




public String getNiveau() {
	return niveau;
}


public void setNiveau(String niveau) {
	this.niveau = niveau;
}


public String getMinistr() {
	return ministr;
}


public void setMinistr(String ministr) {
	this.ministr = ministr;
}

@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private grade graade;

@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private fonction fonnction;


@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private classe classee;

@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private Categorie cat;

@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private groupe group;

@ManyToOne (fetch=FetchType.EAGER, cascade=CascadeType.ALL)
private deptgen dept;



}
