package collectionframework;

public class Laptop implements Comparable<Laptop> {
    int code;
    String brand;
    Long price;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Laptop(int code, String brand, Long price) {
        this.code = code;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "code=" + code +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop o) {
        if(this.code>o.code)
            return -1;
        else if(this.code<o.code)
            return 1;
        else {
          this.brand.compareTo(o.getBrand());
           return 0;
        }
    }
}



