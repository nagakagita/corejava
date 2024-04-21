package returntestbykal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommonElementsInMap {
    public static void main(String[] args) {
        Map<String, String> m0 = new HashMap<String, String>();
        m0.put("a", "a");
        m0.put("b", "3");
        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("c", "c");
        m1.put("b", "3");
        //option 1
        /*Set<String> s = new HashSet<String>(m0.values());
        s.retainAll(m1.values());
        System.out.println(s);*/
        // option 2  whether map contains duplicates or not
        boolean hs=new HashSet<String>(m0.keySet()).retainAll(m1.keySet());
        System.out.println("s="+hs);

    }
}
