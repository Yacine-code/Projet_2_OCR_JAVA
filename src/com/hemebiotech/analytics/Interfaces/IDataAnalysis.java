package com.hemebiotech.analytics.Interfaces;

import java.util.Map;

/**
 * <h1>IDataAnalysis</h1>
 * Cette interface est utlisée pour afin d'implémenter une classe concrète contenant la méthode implémentées par l"interface
 * <p>
 * It contains a method for analyzing the data from the source.
 * 
 * @author Yacine Ghazali
 * @version 1.0
 */
public interface IDataAnalysis {
/**
 * Cette méthode sera utilisé afin de traiter les donnnées
 * **/

	Map<String, Integer> proceedData();

}
