package $group$;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

//CHECKSTYLE:OFF
@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }
        , name = { "Manage Users" })
public class ManageUsersTestRunner {

}
