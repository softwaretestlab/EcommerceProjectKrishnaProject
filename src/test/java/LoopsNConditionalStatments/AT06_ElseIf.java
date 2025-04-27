package LoopsNConditionalStatments;
import org.junit.Test;
public class AT06_ElseIf {
    @Test
    public void ElseIfLoopLearn() {
        String browser = "FIREFOXs";
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("test case will be executed on chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("test case will be executed on firefox");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.out.println("test case will be executed on IE");
        } else {
            System.out.println("Browser is not in the list");
        }
    }
}