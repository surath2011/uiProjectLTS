package logics;

public class reverseWord {
    public static void main(String[] args) {
        String s = "Selenium with Java";
        String [] arr = s.split(" ");
        String revSen = "";
        String revS = "";
        String revSt = "";
        for(int i = 0; i< arr.length; i++){
            String word = arr[i];
            String revWord = "";
            for(int j = word.length()-1; j>=0; j--){
                revWord = revWord+word.charAt(j);
            }
            revSen = revSen +revWord+" ";
            revSt = revWord+" "+revSt;
            revS =  word+" "+revS;
        }
        System.out.println(revSen);
        System.out.println(revSt);
        System.out.println(revS);
    }
}
