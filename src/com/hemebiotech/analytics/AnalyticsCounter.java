package com.hemebiotech.analytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.traitementsDeDonnees.GroupAndCountOccurrences;
import com.hemebiotech.analytics.traitementsDeDonnees.ReadFile;
import com.hemebiotech.analytics.traitementsDeDonnees.WriteFile;
import com.hemebiotech.analytics.construction.DataAnalyse;
import com.hemebiotech.analytics.construction.SymptomReader;
import com.hemebiotech.analytics.construction.WriteInNewFile;

/**
 *
 * <h1>AnalyticsCounter</h1>
 * Cette Classe, à partir d'un chemin de fichier va instancier plusieurs classes
 * afin de permettre à l'application de lire, traiter et compter les symptômes
 * et enfin les écrire dans un fichier result.out
 * <p>
 *
 * @author Yacine Ghazali
 * @version 1.0
 */
public class AnalyticsCounter
{

	private String filepath;


	public AnalyticsCounter(String filepath)
	{
		this.filepath = filepath;
		
	}

	/**
	 *
	 * 
	 */
	public void DataTreatment()
	{
		System.out.println("Lancement de l'application Analytics !");
		// lancement application

		SymptomReader reader = new SymptomReader(new ReadFile(filepath));
		// Analytics application lit le fichier source

		List<String> data = new ArrayList<>(reader.getData());// bufferise les donn�es de "reader"dans "data"

		DataAnalyse analysisTool = new DataAnalyse(new GroupAndCountOccurrences(data));
		//compte les occurences avec "GroupSymptomsAndCountOccurrences"
		
		// puis avec DataAnalysie met le tout dans un MAP

		Map<String, Integer> result = new TreeMap<>(analysisTool.analyze()); // creation d'un map pour recevoir le map retourn� par anlasysisTool.analyze

		WriteInNewFile writeTool = new WriteInNewFile(new WriteFile(result)); // �criture dans un map " writeTool "

		writeTool.writeOutput(); // "�crire sur le contenu du fichier result.out cr�� par la fonction write de 
		
		System.out.println("Analytics application is closed!"); 

	}
}
