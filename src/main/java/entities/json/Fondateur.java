package entities.json;

public class Fondateur {

	private String nom;
	private String dateNaissance;
	private String LieuNaissance;
	
	@Override
	public String toString() {
		return nom + " né le " + dateNaissance + " à " + LieuNaissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return LieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		LieuNaissance = lieuNaissance;
	}
}
