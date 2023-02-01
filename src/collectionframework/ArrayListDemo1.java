package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        Student s1=new Student(1,"abc","Pune");
        Student s2=new Student(2,"xyz","Pune");
        Student s3=new Student(3,"abc1","Pune");
        Student s4=new Student(4,"xyz1","Pune");

        ArrayList<Student> list1=new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(2,s1);
        list1.add(s4);

        System.out.println(list1);
        list1.forEach(l->{
            System.out.println(l);
        });

    }

}



class Student{
    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}