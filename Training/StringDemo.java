public class StringDemo {
    public static void main(String[] args) {
        String s="Today is holiday";
        String s1="is";
        boolean isfound=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==s1.charAt(0))
            {
                int count=0;
                for(int j=0;j<s1.length();j++)
                {
                    if(s.charAt(i)==s1.charAt(j))
                    {
                        count++;
                        i++;
                    }
                }
                if(count==s1.length())
                {
                    isfound=true;
                    System.out.println("YES");
                    break;
                }
            }
        }
        if(isfound==false)
        {
            System.out.println("NO");
        }
    }
}