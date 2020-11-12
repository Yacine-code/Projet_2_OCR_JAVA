
package com.hemebiotech.analytics.construction;

import com.hemebiotech.analytics.Interfaces.IWriteOutput;

/**
 * <h1>WriteOutput</h1>
 *  Cette classe est utlisée pour implémentées une classe et une fonction contenues dans l'interface IWriteOutPut
 *  Elle contient une méthode WriteOutput qui permet d'ecrire dans un fichier cible (en le créant par exemple)
 * <p>
 * Elle contient une méthode qui ecrit dans un fichier en sortie
 * 
 * @author Yacine Ghazali
 * @version 1.0
 */
public class WriteInNewFile {

	private IWriteOutput writeOutput;


	public WriteInNewFile(IWriteOutput writeOutput) {

		this.writeOutput = writeOutput;
	}

	/**
	 * Cette méthode sert à écrire sur un suppor en sortie
	 * 
	 */
	public void writeOutput() {
		writeOutput.write();
	}

}
