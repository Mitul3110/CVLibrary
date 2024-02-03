package steps;

import driverfactory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import searchpage.Searchpage;

public class Searchsteps {

    Searchpage searchpag= new Searchpage(Driverfactory.getdriver());

    @Given("user is on CV Library page")
    public void user_is_on_cv_library_page() {
    Driverfactory.getdriver().get("https://www.cv-library.co.uk/");
    String actual= searchpag.geturl();
        Assert.assertThat(actual, Matchers.endsWith("library.co.uk/"));

    }

    @When("user accepts cookies")
    public void user_accepts_cookies() throws InterruptedException {searchpag.setCookies();

    }

    @When("user searches for {string} in jobtitle")
    public void user_searches_for_in_jobtitle(String name) {searchpag.setJobtitle(name);

    }

    @When("user searches for {string} in location")
    public void user_searches_for_in_location(String string) {searchpag.setLocation(string);

    }

    @When("User enters {string} on distance")
    public void user_enters_on_distance(String string) {searchpag.setDistance(string);

    }

    @When("user clicks on findjobs")
    public void user_clicks_on_findjobs() {searchpag.setFindjobs();

    }

    @Then("user verifies Software Tester jobs in London")
    public void user_verifies_software_tester_jobs_in_london() {

        String actual=searchpag.setText();
        Assert.assertThat(actual,Matchers.equalTo("Software Tester jobs in London"));

    }


}
