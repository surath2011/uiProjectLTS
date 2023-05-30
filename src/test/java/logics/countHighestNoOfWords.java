package logics;

import java.util.*;

public class countHighestNoOfWords {
    public static void main(String[] args) {
        String s = "Selenium with Java is Selenium with Python Selenium and Selenium and also";
        String [] arr = s.split(" ");
        HashMap<String,Integer> wordMap = new HashMap<>();
        for(String word: arr){
            if(wordMap.containsKey(word)){wordMap.put(word,wordMap.get(word)+1);
            }else{wordMap.put(word,1);}
        }
        System.out.println(wordMap);
        Map<String, Integer> maps = sortByValue(wordMap);
        System.out.println(maps);
        Map.Entry<String,Integer> entry1 = maps.entrySet().iterator().next();
        System.out.println("Least repeated word is: "+entry1.getKey());
        String highestRepeated = "";
        for (Map.Entry<String, Integer> entry2 : maps.entrySet()) {highestRepeated = entry2.getKey();}
        System.out.println("Most repeated word is: "+highestRepeated);
    }
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        List<Map.Entry<String, Integer> > list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {temp.put(aa.getKey(), aa.getValue());}
        return temp;
    }
}