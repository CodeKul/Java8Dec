package agrregation;

public class Employee {
    int empNo;
    String name;
    Address address;
}

class Address{
    String flatNo;
    String buildingName;
    String area;
    String landmark;
    int pincode;
    String city;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", area='" + area + '\'' +
                ", landmark='" + landmark + '\'' +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                '}';
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.empNo=101;
        emp1.name="abc";

        Address workaddress=new Address();
        workaddress.flatNo="A-101";
        workaddress.buildingName="Bandal Capital";
        workaddress.area="Kothrud";
        workaddress.landmark="Near Metro station";
        workaddress.pincode=411038;
        workaddress.city="pune";

        emp1.address=workaddress;
        System.out.println("empolyee-no:"+emp1.empNo);
        System.out.println("employee name: " +emp1.name);
        System.out.println("employee address: " +emp1.address);


    }
}
