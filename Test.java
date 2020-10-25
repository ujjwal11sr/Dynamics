import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		int occ[] = new int[n+1];
		for(int i=0;i<n+1;i++){
			occ[i+1] = occ[i];
			if(s.substring(i,i+m).equals(t)) occ[i+1]++;
			
		}
		for(int i=0;i<q;i++){
			int inp1=sc.nextInt();
			int inp2 = sc.nextInt();
			if(inp2-inp1+1<m) System.out.print(0);
			else System.out.print(occ[inp2-inp1+1]-occ[l-1]);
		}
    }
}
    
