import java.util.Scanner;

public class q1 {
    public static void main(String[] args)
    {
        Scanner kadavul = new Scanner(System.in);
        String y = kadavul.nextLine();
        int x = kadavul.nextInt();
        kadavul.nextLine();
        String z = kadavul.nextLine();
        System.out.println("My name is "+y);
        System.out.println("My age is "+x);
        System.out.println("I am from "+z);
    }
}
