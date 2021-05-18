package Chap13;

import java.util.Date;
/****
 * Illegal argument exception for loan amount, interest rate, and
 * number of years equal to or less than zer0
 * */
public class LoadModified {
    private static int created =0;

    public static void main(String[] args) {
        try{
            LoadModified loadModified = new LoadModified(23.3,23,12038);
            LoadModified loadModified2 = new LoadModified(2.0,23,12038.32);
            LoadModified loadModified3 = new LoadModified(0.0,0,-2);
        }catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(LoadModified.getCreated());
    }

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public LoadModified() {
    }

    public LoadModified(double annualInterestRate, int numberOfYears, double loanAmount) {
        setAnnualInterestRate( annualInterestRate);
        setNumberOfYears(numberOfYears);
        setLoanAmount( loanAmount);
        this.loanDate = new Date();
        created++;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {

        if (annualInterestRate >= 0)
            this.annualInterestRate = annualInterestRate;
        else
            throw new IllegalArgumentException("Cannot be zero or less");
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears >= 0)
            this.numberOfYears = numberOfYears;
        else
            throw new IllegalArgumentException("Cannot be zero or less");
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) throws IllegalArgumentException {
        if (loanAmount >= 0 )
            this.loanAmount = loanAmount;
        else
            throw new IllegalArgumentException("Cannot be zero or less");
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public static int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }
}
