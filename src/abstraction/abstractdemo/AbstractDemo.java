package abstraction.abstractdemo;


//hiding details from end user and show only functionality
abstract public class AbstractDemo {
    public void show()
    {
        System.out.println("In abstract class");//concrete methods
    }

    public abstract void play();//abstract method

    public void exercise()//abstract method
    {

    }

}

/**
 *         abstract class                                         interface
 *
 *  1. abstract class have both method,                 1. only abstract (default and static after java 8)
 *       abstract and non-abstract(concrete)
 *
 *  2. we have private,protected and public methods     2. only public(private methods after java 9)
 *
 *  3. abstract can extends another class or implements 3. only interfaces *
 *
 *  4. partial abstraction                              4. 100 % abstraction
 *
 *
 */