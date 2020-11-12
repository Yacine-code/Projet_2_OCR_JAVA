package com.hemebiotech.analytics.construction;

import java.util.List;

import com.hemebiotech.analytics.Interfaces.ISymptomReader;

/**
  <h1>SymptomReader</h1> T
 Cette classe est utlisée pour implémentées une classe et une fonction contenues dans l'interface ISymptomReader
 Elle contient une méthode getSymptoms qui retourne une liste
  
  I
  @author Ghazali Yacine
  @version 1.0
 */
public class SymptomReader {

	private ISymptomReader data;

	public SymptomReader(ISymptomReader data) {
		this.data = data;
	}

	/**
	 *
	 * Cette méthode utilise la méthode getData de SymptomReaderFromSource et
	 * renvoie une liste avec le résultat.
	 * 
	 * @return List<String> avec les données lues dans le fichier source
	 */
	public List<String> getData() {
		return data.getSymptoms();
	}
}
