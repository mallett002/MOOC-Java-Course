package week5.StupidLyyraCard;

public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private double econPrice = 2.50;
    private double gourmetPrice = 4.00;

    public CashRegister() {
        this.cashInRegister = (double) 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= econPrice) {
            this.economicalSold++;
            this.cashInRegister += econPrice;
            return cashGiven - econPrice;
        } else {
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= gourmetPrice) {
            this.gourmetSold++;
            this.cashInRegister += gourmetPrice;
            return cashGiven - gourmetPrice;
        } else {
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= econPrice) {
            this.economicalSold++;
            return card.pay(this.econPrice);
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= gourmetPrice) {
            this.gourmetSold++;
            return card.pay(gourmetPrice);
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    public String toString() {
        return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
    }
}
