package algorithms.insertionsort;

import java.util.ArrayList;
import algorithms.IAlgorithm;

public class Insertionsort implements IAlgorithm{

	/**
	 * Method for calculating Insertion Sort. Takes in unsorted list, starting with second item 
	 * in list it checks earlier indices to figure out where the current number fits.
	 * @param listA An unsorted arraylist of integers
	 * @return sorted arraylist
	 */
	@Override
	public ArrayList<Integer> sortList(ArrayList<Integer> listA) {
		for(int i = 1; i < listA.size(); i++){
			int currentValue = listA.get(i);
			int gap = i;
			while(gap > 0 && currentValue < listA.get(gap-1)){
				listA.set(gap, listA.get(gap - 1));
				gap = gap - 1;
			}
			listA.set(gap, currentValue);
		}
		return listA;
	}

	@Override
	public String returnCode() {
		// TODO Auto-generated method stub
		return null;
	}
	
}