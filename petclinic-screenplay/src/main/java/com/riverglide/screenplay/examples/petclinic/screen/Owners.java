package com.riverglide.screenplay.examples.petclinic.screen;

import org.openqa.selenium.By;

public class Owners {
    public static Owners screen() {
        return new Owners();
    }

    public By listOfOwners() { return By.xpath("//*[@id=\"owners\"]/tbody"); }
}
