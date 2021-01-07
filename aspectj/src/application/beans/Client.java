package application.beans;

public class Client {
	
	private String nom;
	private Compte compte;

	public String getNom() {
	 return nom;
	 }
	public void setNom(String nom) {
	 this.nom = nom;
	 }
	public Compte getCp() {
	 return compte;
	 }
	public void setCp(Compte compte) {
	 this.compte = compte;
	 }
	public void retirer(double montant){
		compte.debiter(montant);
	 }
	public void verser(double montant){
		compte.approvisionner(montant);
	 } 
}
