package Sorting_Algorithms;

import java.util.Scanner;

public class Bubble_Sort {
	/*
	 * Bubble Sort Algorithm works- 
	 1.It starts from the beginning(index 0), 
	 2.then it compares adjacent elements,
	 3.if current element greater than next element, the swap them
	 4.continue the process until no swapping occurs pass
	 
	 */
	
	public static void bubbleSort(int arr[])
	{
		int size = arr.length;
		for(int i =0;i< size; i++ )
		{
			for(int j=0; j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
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
		System.out.println("----------Bubble Sorting-----------");
		System.out.print("Unsorted Array elements are: "); 
		for (int j =0;j<size; j++)
		{
			System.out.print(array[j]+" ");
		}
		System.out.println();
		
		bubbleSort(array);
		System.out.print("Sorted Array elements are: ");
		for(int k=0;k<size;k++)
		{
			System.out.print(array[k]+" ");
		}
		scan.close();

	}

}
