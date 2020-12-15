package java_xml_json.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="donneesEconomiques")
public class DonneesEconomiques {
	
	@XmlElement
	private String monnaie;
	@XmlElement
	private Pib pib;
	
	public String getMonnaie() {
		return monnaie;
	}
	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	public Pib getPib() {
		return pib;
	}
	public void setPib(Pib pib) {
		this.pib = pib;
	}
}
