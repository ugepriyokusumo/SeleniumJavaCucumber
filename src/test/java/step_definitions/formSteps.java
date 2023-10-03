package step_definitions;

import base.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.FormPage;
import pages.HomePage;


public class formSteps extends DriverInstance {

    @Given("user click on the completed web form link")
    public void userClickOnTheCompletedWebFormLink() {
        HomePage.userClickOnTheCompletedWebFormLink();
    }

    @When("user fill first name with {string}")
    public void userFillFirstNameWith(String first_name) {
        FormPage.userFillFirstNameWith(first_name);
    }

    @When("user fill last name with {string}")
    public void userFillLastNameWith(String last_name) {
        FormPage.userFillLastNameWith(last_name);
    }

    @When("user fill job title with {string}")
    public void userFillJobTitleWith(String job_title) {
        FormPage.userFillJobTitleWith(job_title);
    }

    @When("user click level education")
    public void userClickLevelEducation() {
        FormPage.userClickLevelEducation();
    }

    @When("user click male gender")
    public void userClickMaleGender() {
        FormPage.userClickMaleGender();
    }

    @When("user click submit button")
    public void userClickSubmitButton() {
        FormPage.userClickSubmitButton();
    }

    @Then("user verify The form was successfully submitted")
    public void userVerifyTheFormWasSuccessfullySubmitted() {
        FormPage.userVerifyTheFormWasSuccessfullySubmitted();
    }
}
