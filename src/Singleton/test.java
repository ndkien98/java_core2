package Singleton;

import testAdapter.Adapter;

public class test {

    Singleton singleton = Singleton.getInstance();

    LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();

    Adapter adapter = new Adapter();


    public void ouputTest(){

        singleton.outPutSingleton();
        lazyInitializedSingleton.outPutLazy();

    }


    public static void main(String[] args) {

        test test = new test();
        test.ouputTest();


    }






}
