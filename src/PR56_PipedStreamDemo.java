import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PR56_PipedStreamDemo {
    public static void main(String[] args) throws IOException {
        PipedOutputStream output = new PipedOutputStream();
        PipedInputStream input = new PipedInputStream(output);

        Thread producer = new Thread(()->{
            try {
                output.write("Hello from producer thread".getBytes());
                output.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(()->{
            try {
                InputStreamReader reader = new InputStreamReader(input);
                char[] buffer = new char[100];
                int read = reader.read(buffer);
                System.out.println("Consumer thread read: " + new String(buffer, 0, read));
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
