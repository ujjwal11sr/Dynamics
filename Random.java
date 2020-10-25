import java.util.*;


public class Random{
	
	public static void main(String args[]){
		System.out.println(Math.random());
		
		for(int i=0;i<5;i++){
			System.out.print((int)(Math.random()*(i+1)));
		}
	}
}