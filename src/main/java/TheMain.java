import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import java_xml_json.entities.Datas;
import java_xml_json.entities.Pays;

public class TheMain {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jc = JAXBContext.newInstance(Datas.class);
		
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		
		Datas datas = (Datas) unmarshaller.unmarshal(new File("C:\\Users\\jerem\\OneDrive\\Bureau\\XML - JSON\\Tp1 - XML.xml"));
		
		for (Pays p : datas.getLesPays()) {
			System.err.println("------------------------------------------------");
			System.out.println("NOM DU PAYS => " + p.getNom());
			System.out.println("DATE DE RELEVE => " + p.getDateDeReleve());
			System.out.println("FECONDITE => " + p.getDonneesDemographiques().getFecondite().getFecondite() + " (" + p.getDonneesDemographiques().getFecondite().getUnite() + ") ");
			System.out.println("POPULATION => " + p.getDonneesDemographiques().getPopulation().getPopulation() + " (" + p.getDonneesDemographiques().getPopulation().getUnite() + ") ");
			System.out.println("MONNAIE => " + p.getDonneesEconomique().getMonnaie());
			System.out.println("PIB =>" + p.getDonneesEconomique().getPib().getPib() + " (" + p.getDonneesEconomique().getPib().getUnite() + ") ");
			System.err.println("------------------------------------------------");
		}

	}

}
