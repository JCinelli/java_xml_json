package java_xml_json.entities.old;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="datas")
public class Datas {
	
	@XmlElement(name="pays")
	private List<Pays> lesPays = new ArrayList<>();

	public List<Pays> getLesPays() {
		return lesPays;
	}

	public void setLesPays(List<Pays> lesPays) {
		this.lesPays = lesPays;
	}

}
