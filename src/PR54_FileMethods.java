import java.io.File;
import java.io.IOException;

public class PR54_FileMethods {
    public static void main(String[] args) {
        File f1 = new File("E:/BCA Sem IV/data");
        System.out.println(f1.isDirectory());

        File f2 = new File("E:/BCA Sem IV/data/myfile.txt");
        System.out.println(f2.getName());
        System.out.println(f2.getPath());
        System.out.println(f2.length());

        File f3 = new File(f1, "test.txt");
        System.out.println(f3.exists());

        File f4 = new File("E:/BCA Sem IV/data/Priyank");
        boolean isCreated = f4.mkdir();
        if(isCreated){
            System.out.println("Folder Created successfully");
        }else {
            System.out.println("Failed to create a folder.");
        }

        File f5 = new File("E:/BCA Sem IV/data/pvr.txt");
        try {
            boolean newFile = f5.createNewFile();

            if(newFile)
                System.out.println("File created successfully!");
            else
                System.out.println("Failed to created a new file!");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
