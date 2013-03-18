package com.riverglide.screenplay.examples.petclinic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home implements Screen {

    private final String url = "http://localhost:8888/petclinic";

    @FindBy(css="h2")
    public WebElement welcomeMessage;
    public WebElement welcomeMessage() { return welcomeMessage; }

    public String location() {
        return url;
    }
}
