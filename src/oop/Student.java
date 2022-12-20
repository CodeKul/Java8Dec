package oop;

public class Student {
    public int rollNo;  //instance or global
    public String name;
    public String address;

    public  String read(int i,String objectName,String addr) //method definition with dummy variables
    {
       String str=objectName;//local
        this.rollNo=i;
        this.address=addr;
        System.out.println("Roll No is:" +this.rollNo);
        System.out.println(str);
        System.out.println(this.address);
        System.out.println(this.name+" is reading");
        return "Student created successfully";
    }
    public int write(int i,String objectName,String addr)
    {
        this.name=objectName;
        this.rollNo=i;
        this.address=addr;
        System.out.println("Roll No is:" +this.rollNo);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.name+" is writing");
        return this.rollNo;
    }
    public static void main(String[] args) {
        Student sahil=new Student();
        Student omkar=new Student();
        String str=sahil.read(1,"sahil","pune");//call method with actual parameters
        System.out.println(str);
        int i=sahil.write(1,"sahil","pune");
        System.out.println(i);
        sahil.read(1,"omkar","pune");
        int i1=omkar.write(1,"omkar","pune");
        System.out.println(i1);

    }
}
