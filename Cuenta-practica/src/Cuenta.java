import java.util.Date;

public class Cuenta {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;

    public Cuenta(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreate = new Date();
    }

    public Cuenta(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 4.5;
        dateCreate = new Date();
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreate(){
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public double getMonthlyInterestRate(){
        return (annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public boolean withdraw(double retiro){
        if(balance >= retiro){
            balance -= retiro;
            return true;
        }
        return false;
    }

    public boolean deposit(double deposito){
        if (deposito > 0){
            balance += deposito;
            return true;
        }
        return false;
    }
}