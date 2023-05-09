package DesignPatterns.singleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().eagerSingletonTest();

        StaticBlockSingleton.getStaticBlockSingletion().staticBlockSingletonTest();

        LazySingleton.getLazySingleton().lazySingletonTest();

        ThreadSafeSingleton.getThreadSafeSingleton().threadSafeSingletonTest();

        BillPughSingleton.getInstance().billPughSingletonTest();
    }
}
