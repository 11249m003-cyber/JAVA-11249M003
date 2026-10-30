interface Payment {
    void pay(double amount);
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using UPI.");
    }
}

class CardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using Card.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        Payment p2 = new CardPayment();

        p1.pay(1000);
        p2.pay(2500);
    }
}
