package linked_list;
import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addFirst("this");
        list.addLast("list");
        list.add("last default");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            
            
            System.out.print(list.get(i) + ">--");

        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
