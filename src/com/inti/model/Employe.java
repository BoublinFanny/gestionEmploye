package com.inti.model;

public class Employe {
	private long idEmploye;
	private String nomEmploye;
	private int age;
	private float salaire;
	
	private Employe() {
		
	}

	public long getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(long idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
	
}
