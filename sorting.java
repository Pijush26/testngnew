package day1;

import java.util.*;


public class sorting
{
	public static void main(String[] args) 
	{
	
	Integer[] arr=new Integer[]{80,3,200,860,9};
	System.out.println("Before Sorting");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+ " ");
	}
	System.out.println("After Sorting");
	List<Integer> al=Arrays.asList(arr);
	//System.out.println(al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	
	
	
	
	}
}
