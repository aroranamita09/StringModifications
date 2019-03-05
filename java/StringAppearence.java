import java.util.HashMap;
import java.util.Map;

public class StringAppearence {
    public Map<String, Boolean> checkStrAppearence(String strArr[]){
        if (strArr == null){
            return null;
        }
        Map<String, Boolean> hmap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        int freq = 0;
        for(String str : strArr){
            if(!countMap.containsKey(str)){
                freq = 1;
                countMap.put(str, freq);
                hmap.put(str, false);
            }
            else{
                int count = countMap.get(str);
                count = count + 1;
                countMap.put(str, count);
                if (countMap.get(str) >= 2){
                    hmap.put(str, true);
                }
            }
        }
        System.out.println(hmap);
        return hmap;
    }
}
