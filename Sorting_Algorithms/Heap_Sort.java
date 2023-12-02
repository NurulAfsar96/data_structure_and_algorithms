package Sorting_Algorithms;

import java.util.Scanner;

public class Heap_Sort {
	
	public static void heap(int array[],int size, int i) 
	{
		int largest = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i +2;
		
		if(leftChild < size && array[leftChild] > array[largest])
		{
			largest = leftChild;
		}
		
		if(rightChild < size && array[rightChild] > array[largest])
		{
			largest = rightChild;
		}
		if(largest != i)
		{
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;
			heap(array, size, largest);
		}
	}
		
		public static void heapsort(int array[], int size)
		{
			for(int i = size/2 -1; i>= 0; i--)
			{
				heap(array, size, i);
			}
			
			for(int i = size-1; i>=0; i--)
			{
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			heap(array, i, 0);
			}
		}


	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		
		int size;
		System.out.println("Enter the size of Array : ");
		size = input.nextInt();
		
		int array[] = new int [size];
		
		System.out.println("Enter the array elements: ");
		for (int a=0;a<size;a++)
		{
			array[a]=input.nextInt();
		}
		System.out.println("------------ HEAP SORT --------------");
		System.out.println();
		System.out.print("Unsorted Array: ");
		for (int a=0;a<size;a++)
		{
			System.out.print(array[a]+" ");
		}
		heapsort(array,size);
		System.out.println();
		System.out.print("Sorted Array: ");
		for (int a=0;a<size;a++)
		{
			System.out.print(array[a]+" ");
		}
		
		input.close();
	}

}
