package interfa.example;

public class Main {
    public static void main(String[] args) {
        SBI s=new SBI();
        s.rateOfInterest();
        FBI f=new FBI();
        f.rateOfInterest();
        System.out.println("Rate of interest"+s.rateOfInterest());

        System.out.println("Rate of interest"+f.rateOfInterest());

    }
}
