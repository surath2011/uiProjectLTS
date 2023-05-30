package logics;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String str = "my name is surath samaddar";
        char [] arrStr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i<arrStr.length; i++){
            if(map.containsKey(arrStr[i])){
                map.put(arrStr[i],map.get(arrStr[i])+1);
            }else{
                map.put(arrStr[i],1);
            }
        }
        for(Map.Entry<Character, Integer> m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
