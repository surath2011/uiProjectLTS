package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demoLogic {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(40);
        nums.add(20);
        nums.add(10);
        nums.add(60);
        nums.add(30);
        int m,temp = 0;
        for(int i=0;i<nums.size()-1;i++){
            m = i;
            for(int j=i+1;j<nums.size();j++) {
                if (nums.get(m) > nums.get(j)) {
                    m=j;
                }
            }
            temp = nums.get(i);
            nums.set((i), nums.get(m));
            nums.set((m), temp);
        }
        System.out.println(nums);
        String name = "I love Java because Java is logical that's why I love it";
        String [] wordArray = name.split(" ");
        HashMap<String,Integer>wordMap = new HashMap<>();
        for(String word: wordArray){
            if(wordMap.containsKey(word)){
                wordMap.put(word,wordMap.get(word)+1);
            }else{
                wordMap.put(word,1);
            }
        }
        System.out.println(wordMap);
        Set<Map.Entry<String,Integer>> entryset= wordMap.entrySet();
        for(Map.Entry<String,Integer> entry : entryset){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
