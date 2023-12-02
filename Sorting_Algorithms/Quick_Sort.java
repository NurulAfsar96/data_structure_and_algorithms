package Sorting_Algorithms;

import java.util.Scanner;

public class Quick_Sort {
	
	public static int partition(int array[], int left, int right)
	{
		int pivot = array[right];
		
		int i = left-1;
		
		for(int j=left; j<right; j++)
		{
			if(array[j]>= pivot)
				{
				i++;
				
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				}
		}
		
		int temp = array[i+1];
		array[i+1] = array[right];
		array[right]= temp;
		
		return i+1;
	}
	
	public static void quicksort(int array[], int left, int right)
	{
		if(left<right)
		{
			int p = partition(array,left,right);
			quicksort(array,left, p-1);
			quicksort(array,p+1,right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the array size: ");
		size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the elements of array-");
		for(int i =0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("--------------- Quick Sort ----------------");
		System.out.print("Unsorted : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		quicksort(arr,0,size-1);
		System.out.println();
		
		System.out.print("Sorted : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();

	}

}
