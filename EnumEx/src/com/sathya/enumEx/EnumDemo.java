package com.sathya.enumEx;

enum Pizza{
	SMALL,MEDIUM,LARGE,EXTRALARGE;
}


public class EnumDemo {
Pizza p;

public EnumDemo(Pizza p) {
	this.p = p;
}
void disp()
{
	switch (p) {
	case SMALL: System.out.println("you ordered small pizza ....ok");
				break;
	case MEDIUM: System.out.println("you have ordred medium pizza .....enjoy...");
				break;
	case LARGE:System.out.println("you havae ordered large one enjoy...");
				break;
	case EXTRALARGE:System.out.println("you have ordered extra larger one.....enjoy more...");
				break;
	}
	}
public static void main(String[] args) {
	EnumDemo e= new EnumDemo(Pizza.EXTRALARGE);
	e.disp();

}

}

