package stepDefinitions;


import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import java.io.IOException;





public class loginPage {
    @Given("log into application with valid credential for different {string} user")
    public void logIntoApplicationWithValidCredentialForDifferentUser(String role) throws InterruptedException {
    	System.out.println("hello1");
    }  
}
