package com.hemebiotech.analytics;

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

		AnalyticsCounter counter = new AnalyticsCounter("../Projet_2_OpenClassRooms/symptoms.txt");
		counter.DataTreatment();
		

	}

}
