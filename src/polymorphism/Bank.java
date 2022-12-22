package polymorphism;

public class Bank {
    public void rateOfInterest(int principle,int duration,float rate){
//        float rate=5.4f;
        float totalInterest;
        totalInterest=(principle*rate*duration)/100;
        System.out.println("interest value="+totalInterest);
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.rateOfInterest(10000,2, 8.4F);//method overloading
        Hdfc hdfc=new Hdfc();
        hdfc.rateOfInterest(10000,2);//method overriding
        Sbi sbi=new Sbi();
        sbi.rateOfInterest(10000,2);
    }
}

 class Hdfc {
    public void rateOfInterest(int principle,int duration){
        float rate=6.4f;
        float totalInterest;
        totalInterest=(principle*rate*duration)/100;
        System.out.println("interest value="+totalInterest);
    }
}

class Sbi {
    public void rateOfInterest(int principle,int duration){
        float rate=8.4f;
        float totalInterest;
        totalInterest=(principle*rate*duration)/100;
        System.out.println("interest value="+totalInterest);
    }
}