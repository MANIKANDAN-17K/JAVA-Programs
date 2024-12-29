abstract class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    abstract void processPayment();
    void paymentDetails() {
        System.out.println("Processing payment of amount: $" + amount);
    }
}
class CreditCardPayment extends Payment {
    private String cardNumber;
    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment for card: " + cardNumber);
    }
}
class UPIPayment extends Payment {
    private String upiID;
    UPIPayment(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment for UPI ID: " + upiID);
    }
}
public class PaymentProcessingUsingAbstractClass {
    public static void main(String[] args) {
        // Using CreditCardPayment
        Payment creditCardPayment = new CreditCardPayment(150.75, "1234-5678-9012-3456");
        creditCardPayment.paymentDetails();
        creditCardPayment.processPayment();

        System.out.println();

        // Using UPIPayment
        Payment upiPayment = new UPIPayment(89.99, "user@upi");
        upiPayment.paymentDetails();
        upiPayment.processPayment();
    }
}

