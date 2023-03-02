package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodRefToArbitoryType {
    public static void main(String[] args) {

        List<Person> list= Arrays.asList(new Person("abc"),
                new Person("xyz"),new Person("asd"));

//        list.forEach(System.out::println);
        list.forEach(Person::getName);
    }

}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("Name:"+this.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
