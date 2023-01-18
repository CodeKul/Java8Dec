package exceptionhandling;

public class MyException {
    public static double calculateArea(int r) throws NegativeRadiousException {
        if(r<1){
            throw new NegativeRadiousException();
        }
        double result=3.14*r*r;
        return result;
    }

    public static void main(String[] args) {
        double k= 0;
        try {
            k = calculateArea(-1);
            System.out.println(k);
        } catch (NegativeRadiousException e) {
            System.out.println(e);
        }
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
    }
}

class NegativeRadiousException extends Exception{
    @Override
    public String getMessage() {
        return "Sorry radious should not be negative";
    }

    @Override
    public String toString() {
        return "Sorry radious should not be negative";
    }
}
