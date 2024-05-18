import java.util.Scanner;

public class oddevenlefttriangle {
    public static void main(String[] args)
    {
        Scanner kadavul = new Scanner(System.in);
        int column = kadavul.nextInt();
        int s = 1;
        for(int i=1;i<=column;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s+" ");
                s+=2;
                
            }
            s--;
            System.out.println("\n ");
        }   
    }
}
