package strings;

public class ImmutableDemo {
    public static void main(String[] args) {
        int a=20;
        System.out.println(a++);
        System.out.println(a);

        String str="code";
        System.out.println(str);

        System.out.println(str.concat("kul"));
        String str1=str.concat("kul");
        System.out.println(str);
        System.out.println(str1);
    }
}
