public class PR45_ThreadTimer implements Runnable{
    private int durationSeconds;
    private Thread thread;

    public PR45_ThreadTimer(int duration){
        this.durationSeconds = duration;
    }

    public void start(){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run(){
        try {
            for(int i=1; i<=durationSeconds; i++){
                Thread.sleep(i*1000);
                System.out.println(i);
            }
            System.out.println("Time is up!");
        }catch (InterruptedException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        PR45_ThreadTimer timer = new PR45_ThreadTimer(5);
        timer.start();
        System.out.println("Timer started...");
    }
}
