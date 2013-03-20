package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.WebBrowsing;
import org.openqa.selenium.WebDriver;

public abstract class WebDriverInteraction {
    protected WebDriver web(Actor user) {
        return user.ability(WebBrowsing.class).skills();
    }

}
