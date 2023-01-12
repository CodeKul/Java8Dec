package strings;

public class StringBufferDemo {
   public static void main(String[] args) {
      StringBuffer stringBuffer = new StringBuffer("Pune");//thread safe
      System.out.println(stringBuffer);
      System.out.println(stringBuffer.append(" is metrocity "));
      System.out.println(stringBuffer);


      StringBuilder stringBuilder=new StringBuilder("Pune");//not thread safe
      System.out.println(stringBuilder);
      System.out.println(stringBuilder.append(" is education hub"));
      System.out.println(stringBuilder);


//      String str="pune";
//      System.out.println(str);
//      System.out.println(str.concat(" is metrocity "));
//      System.out.println(str);
   }




}

