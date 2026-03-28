package logic_Array.revision3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {

    public static void main(String[] args) {

        String s = "tree";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        list.sort((a,b) -> map.get(b) - map.get(a));

        System.out.println(list); // [e, t, r]
    }
}
