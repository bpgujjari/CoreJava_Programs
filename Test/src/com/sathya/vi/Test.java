package com.sathya.vi;

public class Test {
public static void main(String[] args) {
	int[] arr= {3,4,6,5,7,8};
//	for (int i = 0; i < arr.length; i++) {
//		boolean isprime=true;
//		for (int j = 2; j <arr[i]; j++) {
//			if(arr[i]%j==0)
//			{
//				isprime=false;
//				break;
//			}
//			
//		}
//		if(isprime)
//		{
//			System.out.println(arr[i]);
//		}
//	}
	
//	
//	for (int i = 0; i < arr.length; i++) {
//		int sum=0;
//		for (int j = 1; j <arr[i]; j++) {
//				if(arr[i]%j==0)
//					sum=sum+j;
//		}
//		if(sum==arr[i])
//			System.out.println(arr[i]+"-------->");
//	}
	
	
//	int num=158;
//	
//	int org=num;
//	int sum=0;
//	while(num>0)
//	{
//		int rem=num%10;
//		sum=sum+rem;
//		num=num/10;
//	}
//		System.out.println(sum);
//	
	
//	
//	int n=151;
//	int res=0;
//	int org=n;
//	
//	while(n>0) {
//		int rem=n%10;
//		res=res*10+rem;
//		n=n/10;
//	}
//	if(org==res)
//		System.out.println(org);
//	
	
	
//	int n=153;
//	int org=n;
//	int power=String.valueOf(n).length();
//	int res=0;
//	
//	while(n>0){
//		int rem=n%10;
//		res+=Math.pow(rem, power);
//		n=n/10;
//		}
//		if(res==org)
//			System.out.println(org);
//		System.out.println("*************");
//	
	
	
//	int n=145;
//	int sum=0;
//	int org=n;
//	while(n>0)
//	{
//	int rem=n%10;
//	int fact=1;
//	for(int i=rem;i>1;i--) {
//		fact=fact*i;
//	}
//	n=n/10;
//	sum=sum+fact;	
//	}		
//	if(sum==org)
//		System.out.println(org+"_________>");
	
	
//	int n=17;
//	int sum=0;
//	while(n>0||sum>9)
//	{
//		if(n==0)
//		{
//			n=sum;
//			sum=0;
//		}
//		int rem=n%10;
//		sum=sum+rem;
//		n=n/10;
//		
//	}
//	System.out.println(sum);
	
	int i=0;
	int n=35;
	int[] arr1= new int[100];
	while(n>0)
	{
		int rem=n%2;
		arr[i]=rem;
		n=n/2;
		i++;
	}
	for(int j=i;j>=0;j--)
		System.out.print(arr1[j]);
	
	
	
}
}
