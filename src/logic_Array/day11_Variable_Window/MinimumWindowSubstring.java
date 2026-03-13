package logic_Array.day11_Variable_Window;

import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++){

            char c = s.charAt(right);

            if(map.containsKey(c)){
                if(map.get(c) > 0)
                    count--;

                map.put(c, map.get(c)-1);
            }

            while(count == 0){

                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar)+1);

                    if(map.get(leftChar) > 0)
                        count++;
                }

                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE)
            System.out.println("");
        else
            System.out.println(s.substring(start,start+minLen));
    }
}
