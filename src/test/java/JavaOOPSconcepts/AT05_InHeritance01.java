package JavaOOPSconcepts;

import org.junit.Test;

public class AT05_InHeritance01 {
    int i =10;
    //this is a method
    @Test
    public void inhMethod01(){

        System.out.println("This is inhMethod01 from parent");
    }

    @Test
    public void inhMethod02(){

        System.out.println("This is inhMethod02 from parent");
    }
    // if child and parent have same method name, then child will over right the parent method
    // this is also called as method overiding
    @Test
    public void inhMethod03(){

        System.out.println("This is inhMethod03 from parent");
    }
}
