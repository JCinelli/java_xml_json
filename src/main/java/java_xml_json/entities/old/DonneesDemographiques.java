package java_xml_json.entities.old;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="donneesDemographiques")
public class DonneesDemographiques {
	@XmlElement
	private Fecondite fecondite;
	@XmlElement
	private Population population;
	
	public Fecondite getFecondite() {
		return fecondite;
	}
	public void setFecondite(Fecondite fecondite) {
		this.fecondite = fecondite;
	}
	public Population getPopulation() {
		return population;
	}
	public void setPopulation(Population population) {
		this.population = population;
	}
}
