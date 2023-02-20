//package collectionframework;
//
//import java.util.*;
//
//public class Laptop  {
//    int code;
//    String brand;
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public Laptop(int code, String brand) {
//        this.code = code;
//        this.brand = brand;
//    }
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "code=" + code +
//                ", brand='" + brand + '\'' +
//                '}';
//    }
//
//
//    public int compareTo(Laptop o) {
//        return this.brand.compareTo(o.brand);
//    }
//
////    @Override
////    public int compareTo(Laptop o) {
////        if (this.code>o.code)       return 1;
////        else if (this.code<o.code) return -1;
////        else
////        return 0;
////    }
//
//}
//
//class LaptopImpl{
//    public static void main(String[] args) {
//        List<Laptop> list=new ArrayList<>();
//        Laptop l1=new Laptop(101,"Dell");
//        Laptop l2=new Laptop(203,"Lenovo");
//        Laptop l3=new Laptop(201,"Hp");
//        list.add(l1);
//        list.add(l2);
//        list.add(l3);
//
////        List<Integer> list1= Arrays.asList(12,4,2,3);
////        Collections.sort(list1);
////        System.out.println(list1);
//        list.forEach(System.out::println);
//        System.out.println();
//
//        Comparator<Laptop> comparator=new Comparator<Laptop>() {
//            @Override
//            public int compare(Laptop o1, Laptop o2) {
//             if(o1.code==o2.code)
//                 return 0;
//             else if (o1.code>o2.code)
//                 return 1;
//             else
//                 return -1;
//            }
//        }     ;
//
//        Comparator<Laptop> comparator1=       (o1,o2) ->{
//
//
//
//                return o1.compareTo(o2);
//            } ;
//
//        Collections.sort(list,comparator.thenComparing(comparator1));
//        list.forEach(System.out::println);
//
//    }
//}
