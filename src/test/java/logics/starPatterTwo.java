package logics;

public class starPatterTwo {
    public static void main(String[] args){
        int row = 5;
        for(int i = 1; i<row+1 ; i++){
            for(int j = row; j>=i ; j--) {
                //System.out.print(" ");
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
