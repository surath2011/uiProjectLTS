package logics;

import java.util.HashMap;
import java.util.Scanner;

public class yantra {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers with spaces in between:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] strArr = str.split(" ");
        int [] nums = new int[strArr.length];
        int b=0;
        for(String h:strArr){
            nums[b] = Integer.parseInt(h);
            b++;
        }
        for(int c:nums){
            System.out.println(c);
        }
        int temp =0;
        for(int m=0;m< nums.length;m++) {
            for (int n = m + 1; n < nums.length; n++) {
                if (nums[m] > nums[n]) {
                    temp = nums[m];
                    nums[m] = nums[n];
                    nums[n] = temp;
                }
            }
        }
        System.out.println("+++++++++++");
        for(int c:nums){
            System.out.println(c);
        }
        System.out.println("+++++++++++");
        System.out.println(nums[0]);
        System.out.println(nums[nums.length-1]);
        System.out.println("+++++++++++");
        String s = "surath samddar surath samaddar";
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 's') {
                ++count;
            }
        }
        System.out.println(count);
        StringBuffer strb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 'a') {
                strb.append(arr[i]);
            }
        }
        String newS = strb.toString();
        System.out.println(newS);
        String[] name = s.split(" ");
        StringBuffer newName = new StringBuffer();
        for (int j = 0; j < name.length / 2; j++) {
            if (name[j] != name[j + 1]) {
                newName.append(name[j]);
            }
        }
        System.out.println(newName.toString());
        HashMap<String, Integer> map = new HashMap<>();
        map.put("abc",1);
        map.put("abc",2);
        System.out.println(map);
        String c = "sprite";
        String d = "";
        d= d+c.charAt(0);
        for(int i = c.length()-2;i>0;i--){
            d=d+c.charAt(i);
        }
        d=d+c.charAt(c.length()-1);
        System.out.println(d);
    }
}
