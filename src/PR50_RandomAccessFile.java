import java.io.RandomAccessFile;

public class PR50_RandomAccessFile {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf = new RandomAccessFile("example.txt", "rw");

            raf.writeBytes("Hello world");
            raf.seek(7);

            byte[] buffer = new byte[5];
            raf.read(buffer);

            System.out.println("Read from file: " + new String(buffer));

            raf.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

