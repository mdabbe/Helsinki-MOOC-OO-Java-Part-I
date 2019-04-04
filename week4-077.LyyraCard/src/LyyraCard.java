public class LyyraCard {
    private double balance;

    public LyyraCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public String toString() {
        return "The card has " + balance + " euros";
    }
    public void payEconomical() {
        if (this.balance>=2.50)
            this.balance -= 2.50;
    }

    public void payGourmet() {
        if (this.balance>=4.00)
            this.balance -= 4.00;
    }

    public void loadMoney(double amount) {
        if (amount<0)
            return;
        if (!(amount+this.balance>150)) {
            this.balance += amount;
        } else {
            this.balance = 150.0;
        }
    }


}
