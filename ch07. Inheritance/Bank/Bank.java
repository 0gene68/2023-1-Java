package ch07.Bank;

public class Bank {
    /*
     * When you take out a loan from a bank, the interest rate for the loan varies from bank to bank.
     * Create a class called Bank that represents a bank, and create BadBank, NormalBank, and GoodBank that inherit from it.
     * The Bank class has a getInterestRate() method to return the interest rate.
     * All child classes override getInterestRate() to return different interest rates.
     */

    public double getInterestRate(){
        return 0.0;
    }
}
