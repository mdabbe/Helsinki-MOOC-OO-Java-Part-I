public class Counter {
    private int counter;
    private boolean check;

    public Counter(int counter, boolean check) {
        this.counter = counter;
        this.check = check;
    }

    public Counter(int counter) {
        this(counter,false);
    }

    public Counter(boolean check) {
        this(0,check);
    }

    public Counter() {
        this(0,false);
    }

    public int value(){
        return counter;
    }

    public void increase() {
        this.counter++;

    }

    public void decrease() {
        if (check) {
            if (!((counter - 1) < 0)) {
                this.counter--;
            }
        } else this.counter--;
    }

    public void increase(int increaseAmount) {
        if (!(increaseAmount<0))
            this.counter += increaseAmount;
    }

    public void decrease(int decreaseAmount) {
        if (!(decreaseAmount<0)) {
            if (check) {
                if (!((counter - decreaseAmount) < 0)) {
                    this.counter -= decreaseAmount;
                } else this.counter = 0;
            } else this.counter -= decreaseAmount;
        }

    }
}
