public class Pattern30 {
    public static void main(String[] args) {
        pattern9(5);
    }

    private static void pattern9(int n) {
        for(int row=1;row<=n;row++){
            for(int spaces=1;spaces<=n-row;spaces++){
                System.out.print("  ");
            }
           for(int col=row;col>=1;col--){
            System.out.print(col+" ");
           }

           for(int col=2;col<=row;col++){
               System.out.print(col+" ");
            }
            System.out.println();
        }
       
    }
}
/*
        1 
      2 1 2
    3 2 1 2 3 
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5 

 */