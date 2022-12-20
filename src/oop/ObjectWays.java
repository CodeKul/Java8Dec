package oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectWays {
    int i;
    String name;
    public void display(){
        System.out.println("in display method");
    }


    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {

        ObjectWays obj =new ObjectWays();
        obj.display();

        ObjectWays obj1 =ObjectWays.class.newInstance();
        obj1.display();

        Constructor<ObjectWays> obj2=ObjectWays.class.getConstructor();
        ObjectWays obj3=obj2.newInstance();
        obj3.display();


    }
}
