public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros,this.cents + added.cents);
    }

    public Money minus(Money decremented) {
        if (worth(this) - worth(decremented) > 0) {
            int n = worth(this) - worth(decremented);
            int e = n/100;
            int c = n - e*100;
            return new Money(e,c);
        }
        return new Money(0,0);
    }

    public boolean less(Money compared) {
        return worth(this) < worth(compared);
    }

    public int worth(Money m) {
        return m.euros*100 + m.cents;
    }

}
