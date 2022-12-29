package encapsulation;

/**
 * encapsulation - wrapping a data and code in single unit .
 * making field private and giving access them via public getter and setter
 *
 * advantage ->
 *  you can make class read only or write only
 *  you can protect from unauthorized access
 */

public class Employee {
      private int id=4;
      private String name;
      private String address;

      public void setId(int i){
          this.id=i;
      }
    public int getId(){

        return id;
    }


    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }



//    public void show(){
//        System.out.println("in employee class");
//        System.out.println(this.id);
//        System.out.println(this.name);
//    }
//
//
//    public static void main(String[] args) {
//        Employee obj =new Employee();
//        obj.id=11;
//        obj.name="abc";
//        obj.show();
//    }

}
