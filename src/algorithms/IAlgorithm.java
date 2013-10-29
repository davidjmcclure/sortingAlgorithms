package algorithms;

import java.util.ArrayList;

/**
 * Interface for creating a type of algorithm, will be 
 * extended by the different algorithms in the sub-packages
 * to this one.
 * @author David
 * 
 */
public interface IAlgorithm {
	/**
	 * Takes a list of unsorted integers and sorts it using the inherited 
	 * algorithms technique.
	 * @param unsortedList ArrayList of unsorted integers
	 * @return sorted ArrayList
	 */
	ArrayList<Integer> sortList(ArrayList<Integer> unsortedList);
	String returnCode();
}
