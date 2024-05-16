/*A party has been curise (ship), 
the party is organised for limited time - t
the no of guest entering - e(i) and leaving - l(i)
the party at every hour is r4epresented as element of an array
the task is to find the maximum no of hours guest present on the curise at any given instance within t (limited time) hours 
5
52706
21301
348813
op-5

*/


import java.util.Scanner;

public class boatparty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int t = sc.nextInt();
        
        // Initialize arrays to store 'e' and 'l' values
        int[] e = new int[t];
        int[] l = new int[t];
        
        // Read the 'e' array elements
        for (int i = 0; i < t; i++) {
            e[i] = sc.nextInt();
        }
        
        // Read the 'l' array elements
        for (int i = 0; i < t; i++) {
            l[i] = sc.nextInt();
        }
        
        // Array to store the cumulative values
        int[] p = new int[t];
        
        // Variable to keep track of the current person count
        int person = 0;
        
        // Calculate the cumulative values
        for (int i = 0; i < t; i++) {
            person += e[i];
            person -= l[i]; // Assuming 'l' values are to be subtracted
            p[i] = person;
        }
        
        // Find the maximum value and the corresponding index
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < p.length; i++) {
            if (max < p[i]) {
                max = p[i];
                index = i;
            }
        }
        
        // Output the result (adding 1 to the index as it seems to be required)
        System.out.println(index + 1);
        
        sc.close();
    }
}


