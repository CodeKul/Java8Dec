package collectionframework;

public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClass<Integer> obj1=new GenericClass<>();
        obj1.setT(44);
        System.out.println(obj1.getT());

        Student student=new Student(1,"abc","pune");
        GenericClass<Student> obj2=new GenericClass<>();
        obj2.setT(student);
        System.out.println(obj2.getT());


        GenericClass<String> obj3=new GenericClass<>();
        obj3.setT("44");
        System.out.println(obj3.getT());

    }
}
