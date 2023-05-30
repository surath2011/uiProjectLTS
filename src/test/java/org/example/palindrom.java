package org.example;

public class palindrom {
    public static void main(String[] args) {
        String name = "RABCBA";
        char [] nameArray = name.toCharArray();
        int len = nameArray.length;
        int count =0;
        StringBuffer rev = new StringBuffer();
        for(int i = len-1;i>=0;i--){
            rev=rev.append(nameArray[i]);
        }
        System.out.println(rev.toString());
        if(name.equals(rev.toString())){
            System.out.println("this is palindrom");
        }else{
            System.out.println("this is not a palindrom");
        }
        String s1 = "javaguides";
        String s2 = "javadesignpatterns";
        System.out.println(s1+" ------------------------  " + s2);
        // Swapping starts
        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        // Swapping ends
        System.out.println("After Swapping :");
        System.out.println(s1+" -------------------------- "+s2);
    }
}
