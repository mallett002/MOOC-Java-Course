package week6.Money;

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

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int newEuros = added.euros() + this.euros();
        int newCents = added.cents() + this.cents();

        if (newCents > 99) {
            newEuros += newCents / 100;
            newCents %= 100;
        }

        return new Money(newEuros, newCents);
    }

    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        if (this.euros() == compared.euros()) {
            return this.cents() < compared.euros();
        }
        return false;
    }

    public Money minus(Money decremented) {
        if (this.less(decremented)) { // if decremented is greater than this
            int newEuros = 0;
            int newCents = 0;
            return new Money(newEuros, newCents);
        } else {
            int newEuros = this.euros - decremented.euros;
            int newCents = this.cents - decremented.cents;
            if (this.cents < decremented.cents) {
                newEuros--; // take away a dollar
                newCents = 100 - decremented.cents;
            }

            return new Money(newEuros, newCents);
        }
    }
}
