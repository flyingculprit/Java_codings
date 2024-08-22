
import java.util.*;
class hello {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[][] arr=new int[size][size];
       int i,j,max=0,ans=0;
       for(i=0; i<size; i++){
           for(j=0; j<size; j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(i=0; i<size; i++){
           int sum=0;
           for(j=0; j<size; j++){
               sum+=arr[i][j];
           }System.out.println(sum);
           if(sum>max){
               max=sum;
               ans=i;
           }
       }
       System.out.println(max+" "+ans);
    }
}
