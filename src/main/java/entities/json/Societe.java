package entities.json;

import java.util.List;

public class Societe {

	private String nom;
	private SiegeSocial siegeSocial;
	private List<Fondateur> fondateurs;
	private List<ChiffreAffaire> chiffreAffaires;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public SiegeSocial getSiegeSocial() {
		return siegeSocial;
	}
	public void setSiegeSocial(SiegeSocial siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	public List<Fondateur> getFondateurs() {
		return fondateurs;
	}
	public void setFondateurs(List<Fondateur> fondateurs) {
		this.fondateurs = fondateurs;
	}
	public List<ChiffreAffaire> getChiffreAffaires() {
		return chiffreAffaires;
	}
	public void setChiffreAffaires(List<ChiffreAffaire> chiffreAffaires) {
		this.chiffreAffaires = chiffreAffaires;
	}
}
