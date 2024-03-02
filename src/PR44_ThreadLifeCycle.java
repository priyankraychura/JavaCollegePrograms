public class PR44_ThreadLifeCycle implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new PR44_ThreadLifeCycle());
        System.out.println("Thread state 1: " + thread.getState());
        thread.start();
        System.out.println("Thread state 2: " + thread.getState());

        try{
            Thread.sleep(580);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Thread state 3: " + thread.getState());
    }

    @Override
    public void run() {
        System.out.println("Thread running...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread exiting...");
    }
}
