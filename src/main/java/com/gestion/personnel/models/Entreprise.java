package com.gestion.personnel.models;

import jakarta.persistence.*;

@Entity
@Table(name = "entreprise")
public class Entreprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entreprise")
    private Integer idEntreprise;

    
    private String nomEntreprise;

	
    private String adresseEntreprise;

    
    private String emailEntreprise;

    public Integer getIdEntreprise() {
		return idEntreprise;
	}

	public void setIdEntreprise(Integer idEntreprise) {
		this.idEntreprise = idEntreprise;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getAdresseEntreprise() {
		return adresseEntreprise;
	}

	public void setAdresseEntreprise(String adresseEntreprise) {
		this.adresseEntreprise = adresseEntreprise;
	}

	public String getEmailEntreprise() {
		return emailEntreprise;
	}

	public void setEmailEntreprise(String emailEntreprise) {
		this.emailEntreprise = emailEntreprise;
	}

}
