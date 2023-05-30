package logics;

public class starPatternOne {
    public static void main(String[] args){
        int row = 5;
        for(int i = 1; i<row+1 ; i++){
            for(int j = 0; j<=i-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
