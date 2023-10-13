package Sorting_Algorithms;

import java.util.Scanner;

public class Selection_Sort {
	/*
	 * How Selection Sort Algorithm works- 
	 1. At the beginning it finds the minimum element. it does by comparing each element with current element;
	 2. After scanning entire array, replace the first element with the minimum element of the array.
	 3. After first element is sorted, then do the same as step 2 and replace the remaining element with a minimum element
	 4. do it until entire array is being sorted
	 */
	
//selectionsort1 is for ascending order sorting
	public static void selectionSort1(int arr[])
    {
        int size = arr.length;
 
        for (int i = 0; i < size-1; i++)
        {
            int minimum = i;
            for (int j = i+1; j < size; j++)
                if (arr[j] < arr[minimum])
                    minimum = j;
 
            // Swap the found minimum element with the first element
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;  
        }	
    }
	
	//selectionsort2 is for descending order sorting
	public static void selectionSort2(int arr[])
    {
        int size = arr.length;
 
        for (int i = 0; i < size-1; i++)
        {
            int maximum = i;
            for (int j = i+1; j < size; j++)
                if (arr[j] > arr[maximum])
                	maximum = j;
 
            // Swap the found minimum element with the first element
            int temp = arr[maximum];
            arr[maximum] = arr[i];
            arr[i] = temp;  
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
		System.out.println();
		System.out.print("Unsorted Array elements are: "); 
		for (int j =0;j<size; j++)
		{
			System.out.print(array[j]+" ");
		}
		System.out.println();
		
		//Selection_Sort.selectionSort(array);
		selectionSort1(array);
	
		System.out.print("Sorted Array elements Ascending order are: ");
		for(int i=0; i < size; i++){  
            System.out.print(array[i] + " ");  
    }
		System.out.println();
		
		selectionSort2(array);
		
		System.out.print("Sorted Array elements Descending order are: ");
		// using for-each loop-
		for(int desc : array)  {
	        System.out.print(desc+" ");
	    }
		scan.close();
	}
	

}
