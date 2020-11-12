package com.hemebiotech.analytics.Interfaces;

import java.io.IOException;
import java.util.List;

/**
 * <h1>SymptomReaderFromSource</h1>
 * Cette interface est utlisée pour afin d'implémenter une classe concrète contenant la méthode implémentées par l"interface
 * <p>
 *     La méthode récupère les données sources (du fichier)
 * 
 * @author Yacine Ghazali
 * @version 1.0
 *
 */
public interface ISymptomReader {
	/**
	 * Cette méthode servira à lire les données et les récupérer
	 * */
	List<String> getSymptoms();
}
