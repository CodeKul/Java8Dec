package collectionframework;

import java.io.*;

public class Temp {
    public static void main(String[] args) {
//        try {
//            FileOutputStream stream=new FileOutputStream("test.txt");
//            String str="Hello";
//            byte[] arr=str.getBytes();
//            stream.write(arr);
//            System.out.println("written");
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            FileInputStream stream=new FileInputStream("test.txt");
//            int i= stream.read();
//            while (i>0){
//                System.out.print((char) i);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            FileWriter fileWriter=new FileWriter("test.txt");
//            fileWriter.write("Welcome to Java");
//            System.out.println("wirtten");
//            fileWriter.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            FileReader reader=new FileReader("test.txt");
//            int i=reader.read();
//            while (i>0){
//                System.out.print((char) i);
//                i= reader.read();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        File file=new File("test.txt");
        if(file.delete())
            System.out.println("file deleted");

    }
}
