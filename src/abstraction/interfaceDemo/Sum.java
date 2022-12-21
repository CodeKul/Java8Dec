package abstraction.interfaceDemo;

public class Sum implements Operation,Operation1 {

    @Override
    public void add() {
    int a=10;
    int b=20;
        System.out.println("addition is"+(a+b));

    }

    @Override
    public void subtract() {
        int a=10;
        int b=20;
        if(a>b){
            System.out.println("substraction is"+(a-b));
        }
        else
            System.out.println("a is smaller than b ");

    }
    @Override
    public void multiply() {
        System.out.println("in multiply");
    }

    @Override
    public void divide() {

    }


    public static void main(String[] args) {
        Sum obj1=new Sum();
        obj1.add();
        obj1.subtract();
        obj1.divide();
        obj1.multiply();
    }


}
