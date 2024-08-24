import java.util.*;

public class list {
    public static void main(String[] args) {
        list l = new ArrayList();
        l.add(100);
        l.add("cyber");
        l.add(true);
        System.out.println(l);
        int size = l.size();
        System.out.println(size);
        Integer integer = l.get(3);
        l.remove(3);
        int lastindexof = l.lastindexof(100);
        System.out.println(lastindexof);

    }
    
}
