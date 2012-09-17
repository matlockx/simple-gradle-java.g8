package $group$;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import cucumber.table.DataTable;

public class ManageUsersTest {
    @Given("^the following user records\$")
    public void the_following_user_records(DataTable arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        // For automatic conversion, change DataTable to List<YourType>
        throw new PendingException();
    }

    @Given("^I am logged in as \"([^\"]*)\" with password \"([^\"]*)\"\$")
    public void I_am_logged_in_as_with_password(String arg1, String arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I visit profile for \"([^\"]*)\"\$")
    public void I_visit_profile_for(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should see \"([^\"]*)\"\$")
    public void I_should_see(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should not see \"([^\"]*)\"\$")
    public void I_should_not_see(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
