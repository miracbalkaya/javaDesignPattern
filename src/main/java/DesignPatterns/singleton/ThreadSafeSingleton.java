package DesignPatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    public static synchronized ThreadSafeSingleton getThreadSafeSingleton() {
        if (threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

    private ThreadSafeSingleton(){

    }

    public void threadSafeSingletonTest(){
        System.out.println("ThreadSafe Singleton method");
    }
}
