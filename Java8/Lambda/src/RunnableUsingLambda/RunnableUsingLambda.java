package RunnableUsingLambda;

public class RunnableUsingLambda {
    public static void main(String[] args) {
        /**
        * Prior java 8 Legacy way
        * */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Prior java 8 Legacy way : New Thread 1");
            }
        };
        new Thread(runnable).start();
        /**
         * Java 8 Lambda
         * */
        Runnable runnable1 = () -> {
            System.out.println("Java 8 Lambda : New Thread 2");
        };
        new Thread(runnable1).start();
        /***
         * Or we can do
         */
        new Thread(()->System.out.println("One line Lambda: new thread 3")).start();
    }
}
