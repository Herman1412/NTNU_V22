package oving2;

public class Account {
    
    private double balance;
    private double interestRate;

    public Account(double balance, double interestRate) {
        if (balance >= 0 && interestRate >= 0){
            this.balance = balance;
            this.interestRate = interestRate;
        }
        else throw new IllegalStateException("Du må legge til mer en 0 kr.");
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate >= 0){
            this.interestRate = interestRate;
        }
        else throw new IllegalStateException("Du må legge til mer en 0 kr.");
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        if (this.balance - balance >= 0){
            this.balance -= balance;
        }
        else throw new IllegalStateException("Balance can not be negative");
    }

    public void addInterest(){
        balance += balance * (interestRate / 100);
    }

    @Override
    public String toString() {
        return "{" +
            " balance='" + getBalance() + "'" +
            ", interestRate='" + getInterestRate() + "'" +
            "}";
    }

    public static void main(String[] args) {
        
    }

}

//oppgaver 
// en synlighetsmodifikator bestemmer tilganngen til klasser, variabler, metoder og konstruktører
// public gjør at det som er public er synlig for over alt,
// når noe er private er det kun synlig i klassen.

// Tillstandene gjøres ikke synlig for andre objekter ved at de er private 
// klassen er tjenesteorientert fordi den hovedsakelig har getter og setter metoder og skal kun huske og håndtere data.

// Man kan dele opp navnet til fornavn og etternavn.
// Anternative måter er å ha to separate atributter, en med hver verdi,
// eller man kan ha en attributt som kan kombinere begge verdiene.