package logics;

public class fibonacci {
    public static void main(String[] args) {
        int num = 5;
        int result = getNum(num);
        System.out.println(result);
        result = getFact(num);
        System.out.println(result);
    }
    static int getNum(int num){
        int result = 0;
        if(num==0||num==1){
            return 0;
        }if(num==2){
            return 1;
        }
        result = getNum(num-1)+getNum(num-2);
        return result;
    }
    static int getFact(int num){
        if(num==0){
            return 1;
        }
        int result = 0;
        result = num*getFact(num-1);
        return result;
    }
}
