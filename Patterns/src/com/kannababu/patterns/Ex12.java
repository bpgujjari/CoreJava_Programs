package com.kannababu.patterns;

import java.util.Iterator;

public class Ex12{
public static void main(String[] args) {
	for (int i = 1; i <=5; i++)
	{
		for(int j=1;j<=5;j++) {
			if((i+j)%2==0)
			System.out.print("*");
			else
				System.out.print("#");
		}
		System.out.println();

	}
}
}
