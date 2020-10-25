/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int t=sc.nextInt();
		while(t>0){
		    int a = sc.nextInt();
		    int[] arr= new int[a];
		    for(int i=0;i<a;i++){
		        arr[i] =sc.nextInt();
		        
		    }
		    int b = sc.nextInt();
		    int[] brr = new int[b];
		    for(int j=0;j<b;j++){
		        brr[j] = sc.nextInt();
		    }int index=0,count=0,temp=0;
		    for(int i=0;i<a;i++){
		        if(i>=1){ 
		            if(arr[i]<temp)continue;}
		        for(int j=index;j<b;j++){
		            if(arr[i]==brr[j]) {
		                temp=arr[i];
		              //  System.out.println(temp+" Hello");
		                count++;index=j+1;break;
		            }
		        }
		    
	    	}System.out.println(count);t--;
	    }
}
}