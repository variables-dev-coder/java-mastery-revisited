package logic_Array.revision3;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static void main(String[] args) {

        String s = "aabbccc";

        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map); // {a=2, b=2, c=3}
    }
}
