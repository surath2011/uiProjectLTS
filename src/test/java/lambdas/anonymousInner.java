package lambdas;

public class anonymousInner {
    public static void main(String[] args) {
        anoExample a = new anoExample() {
            @Override
            public void display() {System.out.println("Hii display");}
            @Override
            public void print() {
                System.out.println("Hii print");
            }
        };
        a.display();
        a.print();
        a.doSomething();
        System.out.println(a.a);
    }

}
