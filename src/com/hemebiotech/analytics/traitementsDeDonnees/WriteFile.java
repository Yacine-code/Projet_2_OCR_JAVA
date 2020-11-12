package com.hemebiotech.analytics.traitementsDeDonnees;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.hemebiotech.analytics.Interfaces.IWriteOutput;

/**
 * <h1>WriteOutputToFile</h1>
 * La classe WriteOutputToFile est l'implémentation de la manière choisie
 * pour écrire dans un fichier en sortie
 * <p>
 Il contient une méthode pour écrire le résultat dans un fichier.
 * 
 * @author Yacine Ghazali
 * @version 1.0
 */
public class WriteFile implements IWriteOutput {

	private Map<String, Integer> input;

	public WriteFile(Map<String, Integer> input) {
		this.input = input;
	}

	/**
	 *
	 * Cette méthode lit les données de la Map qui contient le résultat
	 * et les écrit dans un fichier dans la destination de sortie.
	 * Si la map est vide, la méthode renvoie un fichier avec le message "No data proceed".
	 * 
	 * @exception IOException On output error
	 * @see IOException
	 */
	@Override
	public void write() {

		File result = new File("result.out");

		try (FileWriter writer = new FileWriter(result)) {

			if (!input.isEmpty()) {

				for (String symptom : input.keySet()) // symptom egal la clef du hashMap
				{
					writer.write(  symptom + " : " + input.get(symptom) + "\n" );
				}
				System.out.println("Analytics application a finit d'écrire dans le fichier.");

			} else {

				writer.write("No data proceeded");

				System.out.println("No data proceeded");
			}
			
			System.out.println("Boucle for:");
			
	        for (Map.Entry mapentry : input.entrySet()) 
	        {
	            System.out.println("nom de la maladie: "+ mapentry.getKey() + " | valeur: " + mapentry.getValue());
	         }


		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
