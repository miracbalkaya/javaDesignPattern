package DesignPatterns.singleton;

public class EagerInitializationSingleton {

    private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getInstance(){
        return INSTANCE;
    }

    public void eagerSingletonTest(){
        System.out.println("Eager Singleton method");
    }
}
