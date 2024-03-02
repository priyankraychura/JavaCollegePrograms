import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PR48_FileStream_B {
    public static void main(String[] args) {
        try{
            FileReader reader =  new FileReader("E:/BCA Sem IV/Java/myfile.txt");
            FileWriter writer = new FileWriter("output.txt");

            int charRead;
            while ((charRead = reader.read()) != -1){
                writer.write(charRead);;
            }

            reader.close();
            writer.close();

            System.out.println("File coppied successfully!");
        } catch (IOException e){
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}
