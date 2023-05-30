package logics;

public class synchronizedExample {
    int count;
    public synchronized void increment(){
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        synchronizedExample s = new synchronizedExample();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) {
                s.increment();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<1000; i++) {
                    s.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(s.count);
        String a ="apple";
        String b = "watermelon";
        a.concat(b);
        System.out.println(a);
    }
}
