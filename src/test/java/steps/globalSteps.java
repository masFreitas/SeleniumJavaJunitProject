package steps;

import cucumber.api.java.en.Then;
import pages.GlobalPage;
import runner.RunnerTest;

public class globalSteps extends RunnerTest{

    GlobalPage globalPage = new GlobalPage();

    @Then("^I see the new account message \"([^\"]*)\"$")
    public void iSeeTheNewAccountMessage(String arg1) throws Throwable {
        globalPage.seeMessage(arg1);
    }

}
