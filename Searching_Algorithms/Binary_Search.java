package Searching_Algorithms;

import java.util.Scanner;

public class Binary_Search {
	
	/*
	 * Binary searching works only sorted array or list. if any given array is not sorted first you should sort the array
	 * Binary Search Algorithm works-----
	 1.Initialize the search range of the entire array in two pointers- 1)left(index 0), 2)right(array_length),
	 2.Calculate the middle index- mid=(left+right)/2;
	 3.Now compare the target element with the middle element;
	 --if(mid_element=target) return mid index;
	 --if(mid_element<target) update left  increasing 1 with mid ; then repeat comparison with new mid
	 --if(mid_element>target) update right decreasing 1 with mid; then repeat comparison with new mid
	 */
	
	
	public static int binarySearch(int arr[], int num)
	{
		int left,right,mid;
		left = 0;
		right =arr.length-1;
		
		while(left<=right)
		{
			mid = (left+right)/2;
			
			if(arr[mid] == num)	{	return mid;	}
			else if(arr[mid] < num)	{	left = mid+1;	}
			else{	right = mid-1;	}
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
		
		int result = binarySearch(array,value);
		
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
