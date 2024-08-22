
import java.util.*;
class array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[][] arr=new int[size][size];
       int i,j;
       int[] arr1=new int[size];
       
       for(i=0; i<size; i++){
           for(j=0; j<size; j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(i=0; i<size; i++,System.out.println()){
           for(j=0; j<size; j++){
               arr1[j]=arr[i][j];
                          }
       Arrays.sort(arr1);
           for(j=0; j<size; j++)
               System.out.print(arr1[j]+" ");
           
       }
       
       
    }}