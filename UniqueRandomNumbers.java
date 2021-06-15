import java.util.ArrayList; 
import java.util.Collections; 
 
public class UniqueRandomNumbers { 
 
    public static ArrayList<Integer> randomSequence(int n) { 
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int i = 0; i < n; i++) { 
            list.add(i); 
        } 
        Collections.shuffle(list); 
        // for (int i = 0; i < 5; i++) { 
        //     System.out.println(list.get(i));
        return list; 
    } 
} 
