package com.ensa;

public class Client {
    
    private String nom;
    private Compte compte;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    @LoggableClientOperation
    public void retirer(double montant) {
        compte.debiter(montant);
    }

    @LoggableClientOperation
    public void verser(double montant) {
        compte.approvisionner(montant);
    }
}
