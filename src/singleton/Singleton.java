package singleton;

public class Singleton {
    private  static  volatile  Singleton singleton;

    public static Singleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println( "我是第一个："+ Singleton.getInstance());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是第二个："+ Singleton.getInstance());
            }
        }).start();
    }
}
