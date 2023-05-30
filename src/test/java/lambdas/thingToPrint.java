package lambdas;

public class thingToPrint {
    public static void main(String[] args) {
        printable pt = (s)-> {
            System.out.println("Hello "+s);
            return s;
        };
        printing(pt);
    }
    static void printing(printable p){
            p.print("!!");
        }

}
