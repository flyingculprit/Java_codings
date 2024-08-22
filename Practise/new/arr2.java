
import java.util.*;
class arr2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int[][] arr=new int[size][];
       int i,j;
       for(i=0; i<size; i++){
           arr[i]=new int[sc.nextInt()];
       }
    
       
       for(i=0; i<size; i++){
           for(j=0; j<arr[i].length; j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(i=0 ;i<size; i++,System.out.println()){
           for(j=0; j<arr[i].length; j++){
               System.out.print(arr[i][j]+" ");
           }}
    }}
