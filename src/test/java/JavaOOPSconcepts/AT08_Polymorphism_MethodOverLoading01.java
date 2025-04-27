package JavaOOPSconcepts;

import org.junit.Test;

public class AT08_Polymorphism_MethodOverLoading01 {


    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }

    public void SumOfNum(int i){
        int j =20;
        int m =i+j;
        System.out.println("This is SumOfNum Second Method value : " + m);
    }

    public void SumOfNum(int i, int j){
        int n =i+j;
        System.out.println("This is SumOfNum Third Method value : " + n);
    }

}
/*
Polymorphism Example (Real-World Inspired)
-------------------------------------------------------------
// Parent class
class Payment {
    public void pay() {
        System.out.println("Processing generic payment...");
    }
}
-----------------------------------------------------------------
// Child class 1
class CreditCardPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing credit card payment...");
    }
}
-----------------------------------------------------------------
// Child class 2
class PayPalPayment extends Payment {
    @Override
    public void pay() {
        System.out.println("Processing PayPal payment...");
    }
}
------------------------------------------------------------------
// Main class
public class PaymentTest {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay();  // Output: Processing credit card payment...

        payment = new PayPalPayment();
        payment.pay();  // Output: Processing PayPal payment...
    }
}
Polymorphism in Action
You call payment.pay() — same method name.

But different implementation is executed at runtime depending on the object type (CreditCardPayment, PayPalPayment).

That’s runtime polymorphism.


 */