package javaLearning;

import org.junit.Test;

public class AT03_StringInt {

    @Test
    public void test03() {
        //declare local variables
        //integers
        int i =10;
        int j =20;
        int k = i+j; //30
        System.out.println("K value is " + k);
    }

    @Test
    public void test04() {
        //declare local variables
        // Strings
        String test01= "Software";
        String test02 = "TestLab";
        String test03 = test01+test02;
        System.out.println("test03 value is "+test03);
    }

}
