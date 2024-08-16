package pattern;
import java.util.*;
public class number_triangle {
    public static void main(String[] args) {
        int x = 5;
        for(int i = 0;i<=x;i++){
            for(int j=0;j<=i;j++){
                System.out.println("*");
                i=i+1;
            }
            System.out.println("\n");
        }
        
    }
}
