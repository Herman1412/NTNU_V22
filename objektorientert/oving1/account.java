package oving2;

public class account {
    
    double balance;
    double intrestrate;

    public void deposit(double balance){
        if (balance > 0){
            this.balance += balance;
        }
        else throw new IllegalStateException("Du må legge til mer en 0 kr.");
    }

    public void setIntrestRate(double intrestrate) {
        this.intrestrate = intrestrate;
    }

    public void addInterest(){
        balance += balance * (intrestrate / 100);
    }

    public double getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return intrestrate;
    }

    @Override
    public String toString() {
        return "{" +
            " balance='" + getBalance() + "'" +
            ", intrestrate='" + getInterestRate() + "%'" +
            "}";
    }


    public static void main(String[] args) {
        account acc = new account();
        acc.setIntrestRate(5.3);
        acc.deposit(1000);
        acc.addInterest();
        System.out.println(acc.toString());
    }

}
