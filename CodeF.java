import java.util.*;


class CodeF{
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		fun(sc);
		
	}
	public static void fun(Scanner s){
		int n = s.nextInt();
		int[] a = new int[n];
		int max=-1;
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
			if(max<a[i]) max=a[i];
		}
		for(int j=1;j<=max;j++){
			for(int i=0;i<n;i++){
				if(j%2==0&&a[i]==j){
					a[i]--;
				}
				if(j%2!=0&&a[i]==j){
					a[i]++;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}