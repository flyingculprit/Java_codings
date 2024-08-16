import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int count = 1;
        for(int i=1;i<=a;i++){
            count = count*i;
            System.out.println(count);
        }
    }
}
