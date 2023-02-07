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

        GenericClass<String> genericClass=new GenericClass();
        genericClass.setT("fgbfgb");
        System.out.println(genericClass.getT());
        GenericClass<Integer> genericClass1=new GenericClass();
        genericClass1.setT(33);
        System.out.println(genericClass1.getT());

    }
}
