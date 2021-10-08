package com.ravi;

public class Increment {

	public static void main(String[] args) {
		int i=0;
		int a=0;
		while (i<3)
		{
		 a=sum(++i);
		
     System.out.println(a);
		}
	}
	
	static int sum(int b) {
		return b;
	}

}
