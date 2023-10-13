package Searching_Algorithms;

import java.util.Scanner;

public class Linear_Search {
	/*
	 * Linear Search Algorithm works-----
	 -Start from the beginning,
	 -Compares the targeted element with current element
	 -if target element and current element match,then returns index(position) of the element
	 -if target element and current element does not match,then it moves to next element and compares until it matches
	 */
	
	public static int linear_search(int arr[], int value)
	{
		for(int i= 0; i<arr.length; i++)
		{
			if(arr[i]==value)
			{
				return i;
			}
			
		}
		return -1;
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
		System.out.print("Array elements are: "); 
		for (int j =0;j<size; j++)
		{
			System.out.print(array[j]+" ");
		}
		System.out.println();
		int value;
		System.out.print("Enter the value you want to search in array: ");
		value = scan.nextInt();
		
		int result = linear_search(array,value);
		
		if(result==-1)
		{
			System.out.println("Element not found in the Array!!!");
		}
		else
		{
			System.out.println("Element found in the Array index no "+result);
		}
		
		
		scan.close();

	}
	

}
