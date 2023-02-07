package collectionframework;

public interface ListInterface {
    void show();
    void display();
    }


 class MyListClass implements ListInterface{

     @Override
     public void show() {
         System.out.println("In show");
     }

     @Override
     public void display() {
         System.out.println("In Display");
     }

     public void add(){
         System.out.println("In add Method");
     }

     public static void main(String[] args) {
         ListInterface obj=new MyListClass();
//         obj.add();
         obj.show();
         obj.display();
     }
 }
