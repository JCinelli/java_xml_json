package entities.json;

public class SiegeSocial {

	private String nom;
	private String ville;
	private String etat;
	private String pays;
	
	@Override
	public String toString() {
		return " Nom :" + nom + "\r Ville : " + ville + "\r Etat : " + etat + "\r Pays : " + pays;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
}
