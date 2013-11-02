package algorithms.mergesort;

import java.util.ArrayList;
import java.util.List;

import algorithms.IAlgorithm;

public class Mergesort implements IAlgorithm{

	@Override
	public ArrayList<Integer> sortList(ArrayList<Integer> unsortedList) {
		ArrayList<Integer> sorted = SplitMerge(unsortedList, 0, unsortedList.size() - 1);
		return sorted;
	}

	private ArrayList<Integer> SplitMerge(ArrayList<Integer> unsorted, int start, int end){
		if((end-start) == 0){
			ArrayList<Integer> sorted = new ArrayList<Integer>();
			sorted.add(unsorted.get(start));
			
			return sorted;
		}
		
		int mid = (end-start)/2 + start;

		ArrayList<Integer> partialA = SplitMerge(unsorted, start, mid);
		ArrayList<Integer> partialB = SplitMerge(unsorted, mid+1, end);
		
		int ACheck = 0;
		int BCheck = 0;
		
		ArrayList<Integer> output = new ArrayList<Integer>();

		while(ACheck < partialA.size() && BCheck < partialB.size()){
			if(partialA.get(ACheck) < partialB.get(BCheck)){
				output.add(partialA.get(ACheck));
				ACheck += 1;
			} else if(partialA.get(ACheck) > partialB.get(BCheck)){
				output.add(partialB.get(BCheck));
				BCheck += 1;
			} else if(partialA.get(ACheck) == partialB.get(BCheck)){
				output.add(partialB.get(BCheck));
				output.add(partialA.get(ACheck));
				ACheck += 1;
				BCheck += 1;
			}
		}

		if(ACheck == partialA.size() & BCheck < partialB.size()){
			for(; BCheck < partialB.size(); BCheck++){
				output.add(partialB.get(BCheck));
			}
		}else if(BCheck == partialB.size() & ACheck < partialA.size()){
			for(; ACheck < partialA.size(); ACheck++){
				output.add(partialA.get(ACheck));
			}	
		}

		return output;
	}
	
	@Override
	public String returnCode() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
