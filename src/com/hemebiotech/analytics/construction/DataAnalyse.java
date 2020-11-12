/**
 * 
 */
package com.hemebiotech.analytics.construction;

import java.util.Map;

import com.hemebiotech.analytics.Interfaces.IDataAnalysis;

/**
 * <h1>DataAnalysis</h1>
 * Cette classe sert à traiter les données reçues à partir d'un support
 * elle est implémentées à partir de l'interface IDataAnalysis.
 *
 * <p>
 * 
 * @author Yacine Ghazali
 * @version 1.0
 *
 */
public class DataAnalyse {

	private IDataAnalysis data;


	public DataAnalyse(IDataAnalysis data)
	{
		this.data = data;
	}

	/**
	 * Cette méthode se sert de la méthode proceedData se trouvant dans IDataAnalysis et retourne une
	 * Map avec le résultat
	 * 
	 * @return Map retourné avec les données traitées
	 */
	public Map<String, Integer> analyze() 
	{
		return data.proceedData();
	}

}
