package filehandling;

import java.io.*;

public class BufferWriterDemo {
    public static void main(String[] args) {
        File file=new File("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/test2.txt");

        try {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/test2.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("This is file test2");
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Some error occured");
        }

        try {
            FileReader fileReader=new FileReader("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/test2.txt");
            BufferedReader reader=new BufferedReader(fileReader);
            int i= reader.read();
            while (i>0){

                System.out.print((char) i);
                i= reader.read();
            }
        } catch (Exception e) {
            System.out.println("Some error occured");
        }

    }
}
