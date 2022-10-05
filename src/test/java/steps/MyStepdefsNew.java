package steps;

import io.cucumber.java.en.Given;

public class MyStepdefsNew {
    @Given("hello")
    public void hello() {
        System.out.println("Welcome");
        System.out.println("To");
        System.out.println("Test");
    }

    @Given("hello again")
    public void helloAgain() {
        System.out.println("Welcome");
        System.out.println("To");
        System.out.println("Test Again");
    }
}
