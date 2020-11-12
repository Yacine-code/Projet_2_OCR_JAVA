package com.hemebiotech.analytics.traitementsDeDonnees;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.Interfaces.ISymptomReader;

/**
 * <h1>ReadFile</h1> Classe servant à lire aprtir de la source
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
	 * @return ArrayList<String> avec tout les symptomes du fichier ou vide si la Arraylist est vide ou si filepath renvoie null
	 * @exception IOException Pas de fichier en entrée
	 * @see IOException
	 */
	@Override
	public List<String> getSymptoms() {

		ArrayList<String> symptoms = new ArrayList<String>();

		if (filepath != null)
		{
			try (BufferedReader br= new BufferedReader(new java.io.FileReader(filepath));)
			{
				// Le fichier d'entrée
				File file = new File(filepath );
				// Créer l'objet File Reader
				FileReader fr = new FileReader(file);
				String line;
				while((line = br.readLine()) != null)
				{

					symptoms.add(line);

				}
				fr.close();

			}
			catch(IOException e)
			{
				e.printStackTrace();
			}



		}

		return symptoms;
	}

}
