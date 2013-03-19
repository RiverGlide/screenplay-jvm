package com.riverglide.screenplay.examples.petclinic.screen;

import com.riverglide.screenplay.Screen;
import org.openqa.selenium.By;

public class Home implements Screen {

    private final String url = "http://localhost:8888/petclinic";

    public By welcomeMessage() { return By.cssSelector("h2"); }

    public String address() {
        return url;
    }

    public static Home screen() {
        return new Home();
    }
}
