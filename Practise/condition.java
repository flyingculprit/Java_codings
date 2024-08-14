import java.util.*;
public class condition {
public static void main(String args[]){
    System.out.println("Input kudu \n AI - 10, IT - 20, CSE - ");
    Scanner vaangu = new Scanner (System.in);  
    System.out.print("dept = ");
    int a = vaangu.nextInt(); 
    if(a==10){
        System.out.print("You are AI dept");
    }
    else if (a==20) {
        System.out.print("You are IT dept");
        
    }
    else{
        System.out.println("You are CSE");
    }
    }

}
