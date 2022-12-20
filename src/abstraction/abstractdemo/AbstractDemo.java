package abstraction.abstractdemo;


//hiding details from end user and show only functionality
abstract public class AbstractDemo {
    public void show()
    {
        System.out.println("In abstract class");//concrete methods
    }

    public abstract void play();//abstract method
    public abstract void exercise();//abstract method

}

/*
Abstract class                          interfaces

1.abstract methods and concrete         only abstract methods
methods

2.extends keyword                       implements keyword

3.partial abstraction                       100% abstraction
 */