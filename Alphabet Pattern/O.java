public class O {
    public static void main(String[] args) {
        for(int i=0;i<7;i++) {
            for(int j=0;j<5;j++) {
                 if(j==0 && i!=0 && i!=6 || i==0 && j!=4 && j!=0 || j==4 && i!=0 && i!=6 || i==6 && j!=4 && j!=0 )   
                    System.out.print("*");
                else 
                    System.out.print(" "); 
            }
            System.out.println();
        }
    }
}