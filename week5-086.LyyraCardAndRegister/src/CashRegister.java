
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        this.cashInRegister = 1000.0;
        this.economicalSold = 0;
        this.gourmetSold = 0;
        // at start the register has 1000 euros
    }

    public double payEconomical(double cashGiven) {
        double lunchPrice = 2.50;
        if (cashGiven >= lunchPrice) {
            this.cashInRegister += lunchPrice;
            this.economicalSold++;
            return cashGiven - lunchPrice;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        double lunchPrice = 4.00;
        if (cashGiven >= lunchPrice) {
            this.cashInRegister += lunchPrice;
            this.gourmetSold++;
            return cashGiven - lunchPrice;
        } else return cashGiven;

    }

    public boolean payEconomical(LyyraCard card) {
        double lunchPrice = 2.50;
        if (card.balance()>=lunchPrice) {
            this.economicalSold++;
            card.pay(lunchPrice);
            return true;
        } else return false;
    }

    public boolean payGourmet(LyyraCard card) {
        double lunchPrice = 4.00;
        if (card.balance()>=lunchPrice) {
            this.gourmetSold++;
            card.pay(lunchPrice);
            return true;
        } else return false;
    }
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum>=0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }





    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
