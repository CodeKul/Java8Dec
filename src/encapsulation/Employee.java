package encapsulation;

//wrap up in one class
//declare variables as private and access using getters and setters

public class Employee {
      private int id;
      private String name;
      private String address;

      public void setId(int i){
          id=i;
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
