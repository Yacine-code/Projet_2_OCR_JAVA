package com.hemebiotech.analytics.traitementsDeDonnees;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.Interfaces.IDataAnalysis;

/**
 * <h1>GroupAndCountOccurrences</h1>
 * Cette Classe sert à  traiter les données
 * <p>
 * Elle contient une méthode pour analyser les données
 * 
 * @author Yacine
 * @version 1.0
 *
 */
public class GroupAndCountOccurrences implements IDataAnalysis
{

	private List<String> source;

	public GroupAndCountOccurrences(List<String> source)
	{
		this.source = source;
	}

	/**
	 * La méthode lit les données brutes à partir d'une lsite et les écrit dans un tree map
	 * avec comme valeur les symptomes comme clef et le nombre d'occurences comme valeur
	 * 
	 * @return TreeMap avec toutes les symptomes de la liste dans l'ordre alphabétique
	 * et regroupés avec le nombre de leurs occurences
	 * Si la liste est vide la méthode retourne un TreeMap Vide I
	 *
	 * @exception IOException On input error
	 * @see IOException
	 */
	@Override
	public Map<String, Integer> proceedData() 
	{

		Map<String, Integer> result = new TreeMap<>();

		if (source != null && !source.isEmpty())
		{

			for (String symptom : source) 
			{

				if (result.containsKey(symptom))
				{

					result.put(symptom, result.get(symptom) + 1);

				} else 
				{

					result.put(symptom, 1);
				}
			}
			System.out.println("Analytics application analyzed the data.");
		}

		return result;
	}

}
