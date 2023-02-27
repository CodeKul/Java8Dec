package filehandling;

import java.io.*;

public class BufferOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream file1 = new FileOutputStream("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/sample1.txt");
            FileOutputStream file2 = new FileOutputStream("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/sample2.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str="file handling is very easy";
            byte[] arr = str.getBytes();

            byteArrayOutputStream.write(arr);
            byteArrayOutputStream.writeTo(file1);
            byteArrayOutputStream.writeTo(file2);

            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream file1 = new FileInputStream("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/sample1.txt");
            FileInputStream file2 = new FileInputStream("/home/nexttechvision/workspace/java8Dec/java8Dec/src/filehandling/sample2.txt");
            SequenceInputStream stream = new SequenceInputStream(file1,file2);
            int i = stream.read();

            while (i > 0) {
                System.out.print((char) i);
                i = stream.read();
            }

            file1.close();
            file2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}