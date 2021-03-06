package ThreadTest.iii.iii_2;

public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;
    public DrawThread(String name,Account account,double drawAmount){
        super(name);
        this.account=account;
        this.drawAmount=drawAmount;
    }

    public void run(){
        // 直接调用account对象的draw方法来执行取钱
        // 同步方法的同步监视器是this，this代表调用draw()方法的对象。
        // 也就是说：线程进入draw()方法之前，必须先对account对象的加锁。
        account.draw(drawAmount);
    }
}
