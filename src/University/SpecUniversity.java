package University;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecUniversity {


    public static int getGroupId(String spec){
        Map<String, Integer> specialty = new HashMap<>();
        specialty.put("Architecture", 10);
        specialty.put("Programming", 11);
        specialty.put("Engeenering", 12);
        specialty.put("Linguistics", 13);

        for (Map.Entry<String, Integer> elem : specialty.entrySet()) {
               if (elem.getKey().equals(spec)) {
                   return elem.getValue();
               }
        }
        return 0;
    }



}
