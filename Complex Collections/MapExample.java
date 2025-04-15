package Collections;
import java.util.*;

public class MapExample {
    public static void main(String[] args){
        Map<String,Integer> map=new HashMap<>();
        map.put("riddhi",1);
        map.put("raj", 2);
        map.put("chandler", 3);
        System.out.println(map.get("chandler"));
        System.out.println(map.getOrDefault("djd",0));
        System.out.println(map.containsKey("raj"));
        Map<Integer,List<Integer>> adj=new HashMap<>();
        // if(adj.get(1)==null)
        //     adj.put(1,new ArrayList<>());
        // adj.get(1).add(2)

        //The above lines can be replaced by
        adj.computeIfAbsent(1, f -> new ArrayList<>()).add(3);
        Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
        for(Map.Entry<String,Integer> entry:entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            System.out.println(key+","+map.get(key));
        }
        NavigableMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(1, "riddhi");
        tmap.put(2, "raj");
        tmap.put(3, "chandler");

        // Correct type: Integer -> String
        Set<Map.Entry<Integer, String>> entrySet1 = tmap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet1) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // KeySet is Set<Integer>, not Set<String>
        Set<Integer> keySet1 = tmap.keySet();
        for (Integer key : keySet1) {
            System.out.println(key + "," + tmap.get(key));
        }
        System.out.println(tmap.firstKey());
        System.out.println(tmap.pollFirstEntry());
        System.out.println(tmap.ceilingKey(2));
        

             
    }
    
}
