package java_xml_json.entities.old;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="fecondite")
public class Fecondite {
	@XmlValue
	private double fecondite;
	@XmlAttribute
	private String unite;
	
	public double getFecondite() {
		return fecondite;
	}
	public void setFecondite(double fecondite) {
		this.fecondite = fecondite;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
}
