package anonymousinnerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Add a=new Add() {
            @Override
            public int addition(int i, int j) {
                return i+j;
            }
            @Override
            public int subtraction(int i, int j) {
                return i-j;
            }        };
        System.out.println(a.addition(4,5));
        System.out.println(a.subtraction(14,5));
    }
}
interface Add{
    default int addition(int i, int j) {
        return 0;
    }

    int subtraction(int i,int j);
}
