import java.util.*;
public class table {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int j = sc.nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i + "*" + j + "=" + i*j);
        }
    }
}
