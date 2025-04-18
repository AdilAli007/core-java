import java.util.*;
public class DemoSorting {
        public static void main(String a[]){
            List<String> list = new ArrayList<String>();
            list.add("Intro Java");
            list.add("Core Java");
            list.add("Advance Java");
            System.out.println("Initial collection value:"+list);
            Collections.addAll(list, "Servlet","JSP");
            System.out.println("After adding elements collection value:"+list);

        }
}

