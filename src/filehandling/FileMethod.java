package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethod {
    public static void main(String[] args) {
        File file=new File("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/test1.txt");
        try {
            file.createNewFile();
            System.out.println("File created successfully..");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getName());
            System.out.println(file.exists());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getFreeSpace());
            System.out.println(file.getParent());
            System.out.println(file.isDirectory());
            System.out.println(file.canWrite());
            System.out.println(file.canRead());
            System.out.println(file.canExecute());
            System.out.println(file.isFile());
            System.out.println(file.length());
            FileWriter writer=new FileWriter("\"/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/test1.txt\"");




        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
