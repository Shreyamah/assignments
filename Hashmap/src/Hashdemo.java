
import java.util.*;
import java.util.Map;

public class Hashdemo {
    public static void main(String args[]){
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        m.put(1,2);
        m.put(2,7);
        m.put(4,4);
        m.put(5,5);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
      //  System.out.println(m.get(2));
       for(Map.Entry e:m.entrySet()){
           System.out.println(e.getKey()+"   "+e.getValue());
           // another way to read key value
           Set s=m.entrySet();
           Iterator i=s.iterator();
           while(i.hasNext()){
            Map.Entry  entry= (Map.Entry) i.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
           }



       }



    }
}
