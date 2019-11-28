package Singleton;

public class Singleton {

    private Singleton singleton;

    private Singleton(){};

    public static Singleton getInstance(){
        return new Singleton();
    }

    public void outPutSingleton(){
        System.out.printf(" toi la singleton");
    }

}

