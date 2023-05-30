package logics;

public class demoThread extends Thread {
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args){
        demoThread d1 = new demoThread();
        demoThread d2 = new demoThread();
        d1.start();
        d2.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from Anonymous inner Runnable class");
            }
        };
        r.run();
    }
}
