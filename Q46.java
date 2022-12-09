package trainingjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Q46 {
    public static List<List<String>> Anagrams(String[] strarr) {
      List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> dic = new HashMap<>();
    
        
        for (int i = 0; i < strarr.length; i++) {
          String temp = strarr[i];
          char[] ch = temp.toCharArray();
          Arrays.sort(ch);
          if (dic.containsKey(String.valueOf(ch))) {
            dic.get(String.valueOf(ch)).add(strarr[i]);
          } else {
            List<String> each = new ArrayList<>();
            each.add(strarr[i]);
            dic.put(String.valueOf(ch), each);
          }
        }
        for (List<String> item: dic.values()) {
          ans.add(item);
        }
        return ans;
    }
    
    public static void main(String args[]){
        String[] strarr={"eat","tea","tan","ate","nat","bat"};
        System.out.println(Anagrams(strarr));
    }
    
}
