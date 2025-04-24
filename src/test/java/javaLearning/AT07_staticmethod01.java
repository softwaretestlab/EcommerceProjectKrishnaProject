package javaLearning;

import org.junit.Test;

public class AT07_staticmethod01 {
//static methods cant be run
  //  they can only be called into other methods for execution
    // for calling static methods we dont need to create an object
    @Test
    public static void test11(){
        System.out.println("This is static method-1");
    }

    @Test
    public static void Test111(){
        System.out.println("This is static method-2");
    }

}
