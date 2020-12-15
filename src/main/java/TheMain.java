import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java_xml_json.entities.news.Datas;
import java_xml_json.entities.old.Pays;

public class TheMain {

	public static void main(String[] args) throws JAXBException {
		
//		JAXBContext jc = JAXBContext.newInstance(Datas.class);
//		
//		Unmarshaller unmarshaller = jc.createUnmarshaller();
//		
//		Datas datas = (Datas) unmarshaller.unmarshal(new File("C:\\Users\\jerem\\OneDrive\\Bureau\\XML - JSON\\Tp1 - XML.xml"));
//		
//		for (Pays p : datas.getPays()) {
//			System.err.println("------------------------------------------------");
//			System.out.println("NOM DU PAYS => " + p.getNom());
//			System.out.println("DATE DE RELEVE => " + p.getDateDeReleve());
//			System.out.println("FECONDITE => " + p.getDonneesDemographiques().getFecondite().getValue() + " (" + p.getDonneesDemographiques().getFecondite().getUnite() + ") ");
//			System.out.println("POPULATION => " + p.getDonneesDemographiques().getPopulation().getValue() + " (" + p.getDonneesDemographiques().getPopulation().getUnite() + ") ");
//			System.out.println("MONNAIE => " + p.getDonneesEconomiques().getMonnaie());
//			System.out.println("PIB =>" + p.getDonneesEconomiques().getPib().getValue() + " (" + p.getDonneesEconomiques().getPib().getUnite() + ") ");
//			System.err.println("------------------------------------------------");
//		}
		
		JAXBContext jc = JAXBContext.newInstance(Pays.class);
		
		Marshaller marshaller = jc.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		Pays pays1 = new Pays();
		pays1.setNom("Bulgarie");
		pays1.setDateDeReleve(LocalDate.now());
		
		File os = new File ( "C:/xml/pays_out.xml" );
		marshaller.marshal(pays1, os);

	}

}
