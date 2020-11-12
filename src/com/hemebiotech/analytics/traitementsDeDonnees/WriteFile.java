package com.hemebiotech.analytics.traitementsDeDonnees;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.hemebiotech.analytics.Interfaces.IWriteOutput;

/**
 * <h1>WriteOutputToFile</h1>
 *
 * La classe WriteOutputToFile est l'implémentation de la manière choisie
 * pour écrire dans un fichier en sortie
 * <p>
 * Il contient une méthode pour écrire le résultat dans un fichieren sortie .
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
	 * et les écrit dans un fichier result.out en sortie.
	 * Si la map est vide, la méthode renvoie un message à la console "Rien n'a été écrit sur le fichier result.out".
	 * Le fichier renvoyé alors est vide.
	 *
	 * 
	 * @exception IOException Si erreur en Sortie (pas de fichier de sortie)
	 * @see IOException
	 */
	@Override
	public void write() {

		File FileResult = new File("result.out");

		try (FileWriter writerTool = new FileWriter(FileResult))
		{


			if (!input.isEmpty())
			{

				for (String symptom : input.keySet())
				{
					writerTool.write(  symptom + " : " + input.get(symptom) + "\n" );
				}
				System.out.println("Analytics application a finit d'écrire dans le fichier.");

			}
			else
				{
					System.out.println("Rien n'a été écrit sur le fichier result.out");
				}
			


		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
