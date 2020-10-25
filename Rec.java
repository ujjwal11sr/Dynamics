/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Rec{
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		int u=sc.nextInt() ;
		System.out.print(gcd(t,u));
	}
	public static String gcd(int n1, int n2){
	    	
		n1 = ( n1 > 0) ? n1 : -n1;
		n2 = ( n2 > 0) ? n2 : -n2;

		while(n1 != n2)
		{
		    if(n1 > n2)
			n1 -= n2;
		    else
			n2 -= n1;
		}
		
	    	return n1;
	}
}
