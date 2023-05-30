package lambdas;

public interface anoExample {
    int a = 5;
    void display();
    void print();
    default void doSomething(){
        System.out.println("Hii do something");
    }
}
