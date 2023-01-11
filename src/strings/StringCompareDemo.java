package strings;

public class StringCompareDemo {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str4="React";
        String str3=new String("Java");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println(str1==str2);
        System.out.println(str1==str3);

        System.out.println(str1.compareTo(str2));
        System.out.println(str4.compareTo(str1));

    }
}
