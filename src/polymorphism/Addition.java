package polymorphism;

//method overloading

//advantage--improves code readbility
public class Addition {
    public void add(){
        System.out.println("in add method");
    }

    public void add(int i){
        i=i+1;
        System.out.println("in add method"+i);
    }

    public void add(int i,int j){
        int temp=i+j;
        System.out.println("addition is"+temp);
    }

    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.add();
        obj.add(2);
        obj.add(2,3);
    }
}
