package com.sathya.Array1;
public class TestEx 
{
public static void main(String[] args) 
 {
	int[] arr= {1,2,3,4,5,4,5,6,6,7,7,7,7,7};
	for (int i = 0; i < arr.length; i++) 
	{
		int freq=1;
		for (int j =i+1; j < arr.length; j++) 
		{
			if(arr[j]==arr[i]) 
			{
				freq++;
				arr[j]=0;
			}
		}
		if(arr[i]!=0)
			System.out.println(arr[i]+"--->"+freq);
	}
 }
}