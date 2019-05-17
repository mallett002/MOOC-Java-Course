package week5.StupidLyyraCard;

public class Main {
    public static void main(String... args) {
//        LyyraCard cardOfPekka = new LyyraCard(10);
//
//        System.out.println("money on the card " + cardOfPekka.balance());
//        boolean succeeded = cardOfPekka.pay(8);
//        System.out.println("money taken: " + succeeded);
//        System.out.println("money on the card " + cardOfPekka.balance());
//
//        succeeded = cardOfPekka.pay(4);
//        System.out.println("money taken: " + succeeded);
//        System.out.println("money on the card " + cardOfPekka.balance());

        // With Implementation of CashRegister
//        CashRegister unicafeExactum = new CashRegister();
//
//        double theChange = unicafeExactum.payEconomical(10);
//        System.out.println("the change was " + theChange );
//
//        theChange = unicafeExactum.payEconomical(5);
//        System.out.println("the change was "  + theChange );
//
//        theChange = unicafeExactum.payGourmet(4);
//        System.out.println("the change was "  + theChange );
//
//        System.out.println( unicafeExactum );

        // With Implementation of card
//        CashRegister register = new CashRegister();
//
//        double theChange = register.payEconomical(10);
//        System.out.println("the change was " + theChange );
//
//        LyyraCard cardOfJim = new LyyraCard(7.0);
//
//        boolean succeeded = register.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = register.payGourmet(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//        succeeded = register.payEconomical(cardOfJim);
//        System.out.println("payment success: " + succeeded);
//
//        System.out.println(register);
        // With Loading Money
        CashRegister register = new CashRegister();
        System.out.println(register);

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = register.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        register.loadMoneyToCard(cardOfJim, 100);

        succeeded = register.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println(register);
    }
}
