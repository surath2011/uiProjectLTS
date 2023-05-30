package logics;

import java.util.*;

public class countCharInString {
    public static void main(String[] args) {
        String s1 = "i love indial";
        char [] s = s1.toCharArray();
        HashMap<Character,Integer> smap = new HashMap<>();
            for (char s2 : s) {
                while(s2!=' ') {
                    if (smap.containsKey(s2)) {
                        smap.put(s2, smap.get(s2) + 1);
                    } else {
                        smap.put(s2, 1);
                    }
                    break;
                }
            }
        System.out.println(smap);
        for(Map.Entry<Character,Integer> entry : smap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
        HashMap<Character, Integer> newMap = sortCharMap(smap);
        System.out.println(newMap);
    }
    public static HashMap<Character, Integer> sortCharMap(HashMap<Character, Integer>smap){
        LinkedList<Map.Entry<Character,Integer>> list = new LinkedList<>(smap.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        LinkedHashMap<Character, Integer>newMap = new LinkedHashMap<>();
        for(Map.Entry<Character, Integer> m:list){
            newMap.put(m.getKey(),m.getValue());
        }
        return newMap;
    }
}
