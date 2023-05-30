package logics;

public class sortingArray {
    public static void main(String[] args) {
        int [] arr = {9,2,8,12,3,0};
        int temp ;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k:arr){
           System.out.println(k);
        }
        System.out.println("***********************************************8");
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}
