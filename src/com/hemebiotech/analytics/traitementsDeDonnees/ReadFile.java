package com.hemebiotech.analytics.traitementsDeDonnees;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.Interfaces.ISymptomReader;

/**
 * <h1>ReadSymptomDataFromFile</h1> Classe servant à lire aprtir de la source
 * <p>
 * Il contient une méthode pour obtenir les données d'un fichier.
 * 
 * @author Yacine Ghazali
 * @version 1.0
 */
public class ReadFile implements ISymptomReader {

	private String filepath;


	public ReadFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * La méthode lit les données d'un fichier à un emplacement donné et les écrit dans un
	 * tableau.
	 * 
	 * @return List<String> avec tout les symptomes du fichier ou vide si la lis est vide ou si filepath renvoie null
	 * @exception IOException On input error
	 * @see IOException
	 */
	@Override
	public List<String> getSymptoms() {

		ArrayList<String> symptoms = new ArrayList<String>();

		if (filepath != null) {
			
			// FileReader : permet de gérer des flux de caractères (lecture)
			try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filepath));)  
			{
				String line = reader.readLine(); // premier sympt�mes
				if (line != null) 
				{
					while (line != null) 
					{
						symptoms.add(line);
						line = reader.readLine(); // passer au prochain sympt�me
					}
					
					System.out.println("Analytics application lit le fichier source.");
					

				}

			} catch (IOException e) 
			
			{
				e.printStackTrace();
			}

		}

		return symptoms;
	}

}
