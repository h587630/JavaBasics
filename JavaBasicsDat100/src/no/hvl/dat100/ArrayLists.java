import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) throws Exception {
     ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        System.out.println(list);

        System.out.println(list.get(2));

        
        list.set(1, 9);
        list.remove(2);

        int size=list.size();
        System.out.println(size);

        //loops
        System.out.print("[");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"   ");
        }
                System.out.println("]");
            //Sorting
            Collections.sort(list);
        
    }
}
