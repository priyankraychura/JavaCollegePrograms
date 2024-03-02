import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PR47_FileStream_A {
    public static void main(String[] args) {
        try{
            FileInputStream inputStream = new FileInputStream("E:/BCA Sem IV/book1.png");
            FileOutputStream outputStream = new FileOutputStream("book2.png");

            int byteRead;
            while ((byteRead = inputStream.read()) != -1){
                outputStream.write(byteRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Image coppied successfully!");
        } catch (IOException e){
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
