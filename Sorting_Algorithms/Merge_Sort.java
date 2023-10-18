package Sorting_Algorithms;

import java.util.Scanner;
/*
 *Merge Sort Algorithm- How it works?
 * First, divided the array into two parts;
 The process continues until the sub arrays contains only one element;
 * Secondly merge the two adjacent sub arrays
 *The process continues until a larger sub array is created and fully sorted
 */

public class Merge_Sort {
	
	public static void merge(int array[], int left, int mid, int right)
	{
		//initialize  two sub arrays and their size
		int size_left =mid-left+1;
		int size_right =right-mid;
		
		int left_array[] = new int[size_left];
		int right_array[] = new int[size_right];
		
	//copy data from original array to temporary array
		for(int i=0;i<size_left; ++i)
		{
			left_array[i] = array[left+i];
		}
		for(int j=0;j<size_right; ++j)
		{
			right_array[j] = array[mid+1+j];
		}
		
		int i =0;
		int j=0;
		int k=left;
		
		while(i<size_left && j< size_right)
		{
			if(left_array[i] <= right_array[j])
			{
				array[k] = left_array[i];
				i++;
			}
			else
			{
				array[k] = right_array[j];
				j++;
			}
			k++;
		}
		
		while(i < size_left)
		{
			array[k] = left_array[i];
			i++;
			k++;
		}
		while(j < size_right)
		{
			array[k] = right_array[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int array[], int left, int right)
	{
		if(left < right)
		{
			int mid = (left+right)/2;
			mergeSort(array,left,mid);
			mergeSort(array,mid+1,right);
			
			merge(array,left,mid,right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter the size of Array: ");
		size = sc.nextInt();
		
		int array[] = new int[size];
		
		System.out.println("Enter the Array elements: ");
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("---------------- Merge Sort Algorithm ---------------");
		System.out.print("Before Sorted :");
		for(int j=0; j<size; j++)
		{
			System.out.print(" "+array[j]);
		}
		System.out.println();
		mergeSort(array,0,size-1);
		
		System.out.print("After Sorted :");
		for(int k=0; k<size; k++)
		{
			System.out.print(" "+array[k]);
		}
		sc.close();
		
	}

}
