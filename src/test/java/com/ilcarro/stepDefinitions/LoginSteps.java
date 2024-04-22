package com.ilcarro.stepDefinitions;

import com.ilcarro.Pages.HomePage;
import com.ilcarro.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.Pages.BasePage.driver;

public class LoginSteps {

    @And("User click on Login link")
    public void Click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    //
    @And("User enters valid data")
    public void Enters_valid_data() {
        new LoginPage(driver).enterData("qwerty007$@gmail.com","Qwerty007$");
    }

    //
    @And("User click on Yalla button")
    public void Click_on_Yalla_button() {
        new LoginPage(driver).clickOnYallaButton();
    }

    //
    @Then("User verifiesSuccess Message is displayed")
    public void verifies_Success_Message() {
        new LoginPage(driver).isMessageDisplayed("Logged in success");
    }


}//clas
