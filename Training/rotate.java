import java.util.*;
public class rotate {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int rot=sc.nextInt();
		for(int i=0;i<rot;i++){
		    int temp=a[0];
		    a[0]=a[n-1];
		  
		    
		    for(int j=n-1;j>=1;j--){
		        a[j]=a[j-1];
		    }
		    a[1]=temp;
		}
		
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
		
	}
}