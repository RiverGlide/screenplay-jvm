package com.riverglide.screenplay.examples.petclinic.location;

import com.riverglide.screenplay.Location;
import org.openqa.selenium.By;

public class Home implements Location {

    private final String url = "http://localhost:8888/petclinic";

    public By welcomeMessage() { return By.cssSelector("h2"); }

    public String address() {
        return url;
    }

    public static Home location() {
        return new Home();
    }
}
