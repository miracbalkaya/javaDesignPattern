package DesignPatterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton staticBlockSingletion;

    static {
        try {
            staticBlockSingletion = new StaticBlockSingleton();
        }catch (Exception e){

        }
    }

    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton getStaticBlockSingletion() {
        return staticBlockSingletion;
    }

    public void staticBlockSingletonTest(){
        System.out.println("StaticBlock singleton method");
    }
}
