package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputAndOutputStream {
    public static void main(String[] args) {
//        File file =new File("Sample.txt");
//        try {
//            file.createNewFile();
//            System.out.println("File created successfully.");
//        } catch (IOException e) {
//            System.out.println("Some Error occured");
//        }

        try {
            FileOutputStream stream=new FileOutputStream("Sample.txt");
            String str="Hello World";
            byte[] arr=str.getBytes();
            stream.write(arr);
            System.out.println("Contents Written");
            stream.close();;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream stream1=new FileInputStream("Sample.txt");
            int i= stream1.read();
            while (i>0){
                System.out.print((char) i);
                i= stream1.read();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
