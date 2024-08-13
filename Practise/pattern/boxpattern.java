package pattern;
import java.util.* ;/** 
 * Innerboxpattern
 */
public class boxpattern{
public static void main(String args[]){
    Scanner kadavulu = new Scanner(System.in);
    int ajithu = kadavulu.nextInt();
    for(int i = 0; i<ajithu; i++){
        for(int j = 0;j<ajithu;j++){
            if(i==0 || j==0 || i==ajithu-1 || j==ajithu-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
           
        }
         System.out.println();
    }

}

}