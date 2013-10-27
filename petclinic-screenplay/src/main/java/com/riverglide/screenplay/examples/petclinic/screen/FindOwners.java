package com.riverglide.screenplay.examples.petclinic.screen;

import com.riverglide.screenplay.Screen;
import org.openqa.selenium.By;

public class FindOwners implements Screen {

    private final String url = "http://localhost:9966/petclinic/owners/find.html";

    public By findOwnersButton() { return By.xpath("//*[@id=\"search-owner-form\"]/fieldset/div[2]/button"); }

    @Override
    public String location() {
        return url;
    }

    public static FindOwners screen() {
        return new FindOwners();
    }
}
