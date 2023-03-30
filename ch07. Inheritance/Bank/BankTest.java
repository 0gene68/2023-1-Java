package ch07.Bank;

public class BankTest {
    public static void main(String[] args) {
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        GoodBank b3 = new GoodBank();

        System.out.println("BadBank's Interest Rate: " + b1.getInterestRate());
        System.out.println("NormalBank's Interest Rate: " + b2.getInterestRate());
        System.out.println("GoodBank's Interest Rate: " + b3.getInterestRate());
        

    }
}
