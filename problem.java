// Java implementation of the above
// approach

import java.util.Map;
import java.util.TreeMap;
public class problem {

    // Function to count frequency of
    // words in the given string
    static void count(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();


        String arr[]=str.split(" ");

        // iterating over words
        for(int i=0;i<arr.length;i++)
        {
//            Checking  if the value is already in the map or not if it is then just incrementing the count
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
    }


    public static void main(String[] args) {
        String str = "vikas is outside" +
                "vikas is not there" +
                "vikas is on the way to bangalore";


        count(str);
    }
}
