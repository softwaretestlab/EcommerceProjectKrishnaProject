package javaLearning;

import org.junit.Test;

public class AT14_TrimLearing {
    @Test
    public void trimlearn(){
        String MyName = "    testlab  ";
        System.out.println("MyName : "+ MyName);
        //Trim will remove front and back spaces
        System.out.println("MyName : "+ MyName.trim());
    }
}
