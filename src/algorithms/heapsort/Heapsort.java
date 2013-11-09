package algorithms.heapsort;

import java.util.ArrayList;
import java.util.Collections;

import algorithms.IAlgorithm;

public class Heapsort implements IAlgorithm {

	@Override
	public ArrayList<Integer> sortList(ArrayList<Integer> unsortedList) {
		return null;
	}
	
	private ArrayList<Integer> heapify(ArrayList<Integer> A){	
		return A;		
	}

	private ArrayList<Integer> siftDown(ArrayList<Integer> A, int start, int end){
		
		int root = start;
		int child, swap;		
		
		while((root*2) + 1 <= end){
			child = (root*2)+1;
			swap = root;
			if(A.get(swap) < A.get(child)){
				swap = child;
			}
			if(child+1 <= end & A.get(swap) < A.get(child+1)){
				swap = child + 1;
			}
			if(swap != root){
				Collections.swap(A, root, swap);
				root = swap;
			}
			else{
				return A;
			}
		}
		return A;		
	}
	
	@Override
	public String returnCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
