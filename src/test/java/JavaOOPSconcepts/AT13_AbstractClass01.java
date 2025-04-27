package JavaOOPSconcepts;
import org.junit.Test;
public abstract class AT13_AbstractClass01 {

    @Test
    public void SumOfNum(){
        int i=10;
        int j=20;
        System.out.println("This is SumOfNum First Method value : " + (i+j));
    }

    //we  know the logic for this below method
    @Test
    public void SubOfNum(){
        int i=40;
        int j=20;
        System.out.println("This is SubOfNum Second Method value : " + (i-j));
    }

    //we don't know the logic for this below method
    public abstract void divOfNum();

}


/*
ABSTRACT CLASS
Real-World eCommerce Example:
Suppose you are testing user actions on a product page, but certain actions vary by role (guest vs registered user).
----------------------------------------------------------------------------------------------------------------------
public abstract class ProductPage {

    public void searchProduct(String name) {
        // common implementation using Selenium
    }

    public abstract void addToCart();  // implemented differently for guest & registered
}
----------------------------------------------------------------------------------------------------------------------
Then:
----------------------------------------------------------------------------------------------------------------------
public class GuestProductPage extends ProductPage {
    public void addToCart() {
        // show login popup before adding to cart
    }
}
----------------------------------------------------------------------------------------------------------------------
public class RegisteredUserProductPage extends ProductPage {
    public void addToCart() {
        // directly add to cart
    }
}
----------------------------------------------------------------------------------------------------------------------
This helps to reuse common code while allowing custom behavior.
Classes should be open for extension, but closed for modification.

If new logic for guests or registered users changes, we don’t want to edit a giant if-else block.

Instead, we extend behavior in new classes.
 */