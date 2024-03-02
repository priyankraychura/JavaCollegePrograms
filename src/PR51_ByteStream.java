import java.io.*;

public class PR51_ByteStream {
    public static void main(String[] args) throws IOException {
        int value = 12345;

        FileOutputStream fileOutputStream = new FileOutputStream("myfile.dat");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeInt(value);
        dataOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("myfile.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        int readValue = dataInputStream.readInt();
        dataInputStream.close();
        fileInputStream.close();

        if(readValue == value){
            System.out.println("The integer value was read sucessfully!");
        }else {
            System.out.println("The integer value was not read correctly!");
        }
    }
}
