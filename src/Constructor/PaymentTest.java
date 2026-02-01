package Constructor;

public class PaymentTest {
    String Pay;
    long amount;
    PaymentTest(String PaymentTest , long amount) {
        this.Pay = Pay;
        this.amount =  amount;
    }
    void processPayment() {
        System.out.println("Payment Process");
        System.out.println("Payment Type :" + Pay);
        System.out.println("Amount :" + amount);
        System.out.println("payment Validated successfully");
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        PaymentTest P1 = new PaymentTest("UPI", 25000l);
        P1.processPayment();
        PaymentTest P2 = new PaymentTest("Credit Card", 50000l);
        P2.processPayment();
    }
    }
