import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import entities.json.ChiffreAffaire;
import entities.json.Fondateur;
import entities.json.SiegeSocial;
import entities.json.Societe;

public class TheMainForJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
//		ObjectMapper mapper = new ObjectMapper();
//		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
//		List<Societe> societes = mapper.readValue(new File("C:\\Users\\jerem\\OneDrive\\Bureau\\XML - JSON\\JSON\\TP01-json.json"), collType);
//		
//		for (Societe societe : societes) {
//			System.out.println("\rNom de la societe : " + societe.getNom());
//			System.out.println("\rSiege social :\n" + societe.getSiegeSocial());
//			System.out.println("\rFondateur(s) :");
//			societe.getFondateurs().forEach(fon -> System.out.println(" " + fon));
//			System.out.println("\rChiffre d'affaires par année : ");
//			societe.getChiffreAffaires().forEach(ca -> System.out.println(" " + ca));
//			System.err.println("\r=================================================================");
//		}
		
		ObjectMapper mapper = new ObjectMapper();
		
		Fondateur fondateur = new Fondateur();
		fondateur.setDateNaissance("12/10/1965");
		fondateur.setLieuNaissance("Le Cannet, France");
		fondateur.setNom("John Rosko");
		
		SiegeSocial siegeSocial = new SiegeSocial();
		siegeSocial.setEtat("Virginie");
		siegeSocial.setNom("LidlExpert");
		siegeSocial.setPays("Etats Unis");
		siegeSocial.setVille("the city");
		
		ChiffreAffaire chiffreAffaire = new ChiffreAffaire();
		chiffreAffaire.setAnnee("2012");
		chiffreAffaire.setChiffreEnmilliardsDe$(12);
		
		ChiffreAffaire chiffreAffaire2 = new ChiffreAffaire();
		chiffreAffaire2.setAnnee("2014");
		chiffreAffaire2.setChiffreEnmilliardsDe$(123.9);

		Societe societe = new Societe();
		societe.setNom("Lidl");
		societe.getFondateurs().add(fondateur);
		societe.setSiegeSocial(siegeSocial);
		societe.getChiffreAffaires().add(chiffreAffaire);
		societe.getChiffreAffaires().add(chiffreAffaire2);
		
		
		mapper.writeValue(new File("C:/temp/objToJson.json"), societe);
	}
	
}
