package inheritance;

//acquiring all properties and method of parent class
//it creates parent child relationship
//advantage--code reusability

public class Sports {
    int i=1;
    public void show(){
        System.out.println("in show method");
    }

    public static void main(String[] args) {
        Sports obj1=new Sports();
        obj1.show();

        Cricket obj2=new Cricket();
        obj2.show();
    }
}

class Cricket extends Sports{
    public static void main(String[] args) {
//      Cricket cricket=new Cricket();

    }
}
