package ThreadTest.iii.iii_5;

class AAA extends Thread{
    public void run() {
        while (true);
    }
}


public class Test {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int i =0;
        System.out.println(System.nanoTime()-start);
    }
}
