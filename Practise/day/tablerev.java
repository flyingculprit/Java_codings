import java.util.*;
public class tablerev {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int j = sc.nextInt();
        for(int i=a;i>=1;i--){
            System.out.println(i + "*" + j + "=" + i*j);
        }
    }
}
