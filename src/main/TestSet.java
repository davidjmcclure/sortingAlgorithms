package main;

import static org.junit.Assert.assertEquals;
import gui.GUIControls;

import java.util.ArrayList;

import org.junit.Test;

import algorithms.bubblesort.Bubblesort;
import algorithms.insertionsort.Insertionsort;
import algorithms.mergesort.Mergesort;

public class TestSet {

	@Test
	public void testInsertionSortList() {
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
				
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(4);
		sorted.add(5);
		sorted.add(6);
		sorted.add(7);
		
		unsorted.add(2);
		unsorted.add(4);
		unsorted.add(7);
		unsorted.add(6);
		unsorted.add(3);
		unsorted.add(1);
		unsorted.add(5);
		
		Insertionsort testAlgorithm = new Insertionsort();
		
		assertEquals("List should be sorted", sorted, testAlgorithm.sortList(unsorted));
	}
	
	@Test
	public void testMergeSortList() {
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
				
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(4);
		sorted.add(5);
		sorted.add(6);
		sorted.add(7);
		
		unsorted.add(2);
		unsorted.add(4);
		unsorted.add(7);
		unsorted.add(6);
		unsorted.add(3);
		unsorted.add(1);
		unsorted.add(5);
		
		Mergesort testAlgorithm = new Mergesort();
		
		assertEquals("List should be sorted", sorted, testAlgorithm.sortList(unsorted));
	}
	
	@Test
	public void testBubbleSortList() {
		
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		ArrayList<Integer> unsorted = new ArrayList<Integer>();
				
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(4);
		sorted.add(5);
		sorted.add(6);
		sorted.add(7);
		
		unsorted.add(2);
		unsorted.add(4);
		unsorted.add(7);
		unsorted.add(6);
		unsorted.add(3);
		unsorted.add(1);
		unsorted.add(5);
		
		Bubblesort testAlgorithm = new Bubblesort();
		
		assertEquals("List should be sorted", sorted, testAlgorithm.sortList(unsorted));
	}
	
	@Test
	public void GUITest(){
		
		GUIControls testGUI = new GUIControls();
		testGUI.runGUI();
		
	}
}
