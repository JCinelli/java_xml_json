import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import entities.json.Societe;

public class TheMainForJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		CollectionType collType = mapper.getTypeFactory().constructCollectionType(List.class, Societe.class);
		List<Societe> societes = mapper.readValue(new File("C:\\Users\\jerem\\OneDrive\\Bureau\\XML - JSON\\JSON\\TP01-json.json"), collType);
		
		for (Societe societe : societes) {
			System.out.println("\rNom de la societe : " + societe.getNom());
			System.out.println("\rSiege social : " + societe.getSiegeSocial());
			System.out.println("\rFondateur(s) : ");
			societe.getFondateurs().forEach(fon -> System.out.println(" " + fon));
			System.out.println("\rChiffre d'affaires par année : ");
			societe.getChiffreAffaires().forEach(ca -> System.out.println(" " + ca));
			System.out.println("\r=================================================================");
		}
	}
	
}
