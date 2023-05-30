package logics;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {12, 17, 12, 15, 20, 20,20};
        int len = arr.length;
        HashSet<Integer> nums = new HashSet<>();
        for (int i = 0; i < len - 1; i++) {
            nums.add(arr[i]);
        }
        ArrayList<Integer> numbs = new ArrayList<>(nums);
        int [] arrNum= new int[numbs.size()];
        for (int k=0; k< numbs.size(); k++) {
            arrNum[k]= numbs.get(k);
        }
        for(int k:arrNum){
            System.out.println(k);
        }

    }
}
