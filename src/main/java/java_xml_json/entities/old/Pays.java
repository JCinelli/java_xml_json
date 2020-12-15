package java_xml_json.entities.old;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="pays")
public class Pays {
	@XmlElement 
	private String nom;
	@XmlElement
	@XmlJavaTypeAdapter(DateAdapter.class)
	private LocalDate dateDeReleve;
	@XmlElement
	private DonneesDemographiques donneesDemographiques;
	@XmlElement
	private DonneesEconomiques donneesEconomiques;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDateDeReleve() {
		return dateDeReleve;
	}
	public void setDateDeReleve(LocalDate dateDeReleve) {
		this.dateDeReleve = dateDeReleve;
	}
	public DonneesDemographiques getDonneesDemographiques() {
		return donneesDemographiques;
	}
	public void setDonneesDemographiques(DonneesDemographiques donneesDemographiques) {
		this.donneesDemographiques = donneesDemographiques;
	}
	public DonneesEconomiques getDonneesEconomique() {
		return donneesEconomiques;
	}
	public void setDonneesEconomique(DonneesEconomiques donneesEconomique) {
		this.donneesEconomiques = donneesEconomique;
	}
}
