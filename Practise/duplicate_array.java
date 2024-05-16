/*remove duplicate 1234
 *print duplicate 2
 *no of duplicate 2
 *without duplicate 134

 *12234*/


//package Java;
import java.util.*;

public class duplicate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[50];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (num == arr[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
           
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
       
        int dup = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                //dup++;
                System.out.println(arr[i]);
            }
        }
        //System.out.println(dup);
    }
}