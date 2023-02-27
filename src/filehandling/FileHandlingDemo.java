package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file=new File("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/test.txt");
        try {
            file.createNewFile();
            System.out.println(file.getPath());
            file.setWritable(true);
            System.out.println("File created successfully");
        } catch (Exception e) {
            System.out.println("File can not be created");
        }
//        try {
//            FileWriter fileWriter=new FileWriter("test.txt");
//            fileWriter.write("This is A sample file");
//            System.out.println("Contents Written");
//            fileWriter.close();
//        } catch (Exception e) {
//            System.out.println("Some error occured");
//        }
//
//        try {
//            FileReader fileReader=new FileReader("test.txt");
//            int i= fileReader.read();
//            while (i>0){            //end of the file
//                System.out.print((char) i);
//                i= fileReader.read();
//            }
//            fileReader.close();
//        } catch (Exception e) {
//            System.out.println("Some error occured");
//        }
//
//        File file1=new File("test.txt");
//        if(file1.delete()){
//            System.out.println("File Deleted");
//        }
//        else {
//            System.out.println("Some error occured");
//        }
    }
}
