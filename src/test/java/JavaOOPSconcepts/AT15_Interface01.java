package JavaOOPSconcepts;

public interface AT15_Interface01 {
    //static variable
    static int x=50;

    //Here we have all abstract methods only
    public void SumOfNum();
    public void SubOfNum();
    public void divOfNum();
}

/*
Real-World eCommerce Example:
Suppose you are testing different types of payment methods (Credit Card, PayPal, Afterpay).
------------------------------------------------------------------
public interface Payment {
    void initiatePayment(double amount);
    void verifyPaymentStatus();
}
-------------------------------------------------------------------
Each class will implement this interface:
-------------------------------------------------------------------
public class CreditCardPayment implements Payment {
    public void initiatePayment(double amount) {
        // Selenium steps or API call to enter credit card details
    }

    public void verifyPaymentStatus() {
        // Check confirmation screen or API response
    }
}
----------------------------------------------------------------------
public class PayPalPayment implements Payment {
    public void initiatePayment(double amount) {
        // Redirect to PayPal and perform steps
    }

    public void verifyPaymentStatus() {
        // Validate PayPal transaction
    }
}
------------------------------------------------------------------------
This ensures code reusability and scalability.

*/