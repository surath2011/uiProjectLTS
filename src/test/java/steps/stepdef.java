package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef {
    @Given("open reqRes")
    public void open_req_res() {
        System.out.println("Hii");
    }
    @When("method get")
    public void method_get() {
        System.out.println("Open");
    }
    @Then("status {int}")
    public void status(Integer int1) {
        System.out.println("close");
    }
}
