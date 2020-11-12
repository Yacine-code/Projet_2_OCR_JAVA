package com.hemebiotech.analytics;

import com.hemebiotech.analytics.construction.DataAnalyse;
import com.hemebiotech.analytics.construction.SymptomReader;
import com.hemebiotech.analytics.construction.WriteInNewFile;
import com.hemebiotech.analytics.traitementsDeDonnees.GroupAndCountOccurrences;
import com.hemebiotech.analytics.traitementsDeDonnees.ReadFile;
import com.hemebiotech.analytics.traitementsDeDonnees.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * <h1>AnalyticsApplication</h1>
 * Cette CLasse lit des symptômes à partir d'un fichier, Ligne par Ligne, Et les écrit
 * dans un Fichier en sortie
 *
 * @author Yacine
 * @version 1.0
 */
public class AnalyticsApplication 
{

	/**
	 * C'est la méthode pricipale, elle instancie la méthode analyzeData qui utilise toutes les classes nécessaires
	 * à la lecture, le traitement et l'écriture des données à patir d'un fichier source
	 *
	 */
	public static void main(String[] args) {

		 String filepath= "../Projet_2_OCR_JAVA/symptoms.txt";

		//AnalyticsCounter counter = new AnalyticsCounter("../Projet_2_OpenClassRooms/symptoms.txt");

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
