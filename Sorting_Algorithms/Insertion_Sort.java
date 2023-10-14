	/*
	 * Insertion sort is a simple and efficient comparison-based sorting algorithm that works 
	 by dividing an input array into two parts: a sorted portion and an unsorted portion. 
	 It then repeatedly takes elements from the unsorted portion and inserts them into their 
	 correct positions within the sorted portion.
	  
	  
	 * How does Insertion Sort Algorithm work?
	 ~ We divided the array in two portion- a) sorted b) unsorted
	 ~ Initially we assume the first element of the array is sorted (index 0 is sorted)
	 ~ Then the remaining element of the array is considered to be unsorted
	 ~ Run a loop for the unsorted array element and put the array elements in a variable
	 ~ Compare the current unsorted element with the elements in the sorted portion.
	 ~ Shift the elements in the sorted portion to the right until the correct position for the current element is found.
	 ~ Continue shifting until you find the correct position or reach the beginning of the sorted portion
	 ~ The array is fully sorted when all elements in the unsorted portion have been moved to the sorted portion
	 Examples:
	 	Input Array: [64, 25, 12, 22, 11]
	 	
		Step 1: [64] | [25, 12, 22, 11]
		Step 2: [25, 64] | [12, 22, 11]
		Step 3: [12, 25, 64] | [22, 11]
		Step 4: [12, 22, 25, 64] | [11]
		Step 5: [11, 12, 22, 25, 64] | []
		
		Sorted Output: [11, 12, 22, 25, 64]

	 */
package Sorting_Algorithms;

import java.util.Scanner;

public class Insertion_Sort {
	
	public static void insertionSort(int array[])
	{
		int size =array.length;
		for(int i=1; i<size; i++) 
		{
			int value =array[i];
			int j = i-1;
			while(j>=0 && array[j]>value)
			{
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=value;
		}
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of Array: ");
		size = scan.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter the Elements: ");
		for (int i =0;i<size; i++)
		{
			array[i]=scan.nextInt();
			
		}
		System.out.println("---------- INSERTION SORT ----------");
		System.out.print("Unsorted Array elements are: "); 
		for (int j =0;j<size; j++)
		{
			System.out.print(array[j]+" ");
		}
		System.out.println();
	
		insertionSort(array);
	
		System.out.print("Sorted Array elements are: ");
		for(int i=0; i < size; i++){  
            System.out.print(array[i] + " ");  
    }
		System.out.println();
		scan.close();
	}

	}

