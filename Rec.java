/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Rec{
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		System.out.print(gcd(t));
	}
	public static String gcd(int n){
	    if(n==2){
	        return ("gcd(int,int)");
	    }
	    return ("gcd(int,"+gcd(n-1));
	}
}