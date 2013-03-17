package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen {

    @FindBy(css="h2")
    public WebElement welcomeMessage;
    public WebElement welcomeMessage() { return welcomeMessage; }
}
