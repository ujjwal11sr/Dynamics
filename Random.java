import java.util.*;


public class Random{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.print((int)(Math.random()*(i+1)));
		}
	}
}
