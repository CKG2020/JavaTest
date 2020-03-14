package ThreadTest.ii;

public class DaemonThread extends Thread{
    //守护线程
    public DaemonThread(String name){
        super(name);
    }


    public void run(){
        DaemonThread dt = new DaemonThread("bbb");
        dt.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName() + "  " + i);
        }
//        while (true);

    }

    public static void main(String[] args) {
        DaemonThread t = new DaemonThread("aaa");
        t.setDaemon(true);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()
            +"  "+i);
        }
        t.getState();

        System.out.println("ok");
    }
}
