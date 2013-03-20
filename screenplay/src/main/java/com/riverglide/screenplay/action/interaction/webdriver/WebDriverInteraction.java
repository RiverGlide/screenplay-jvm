package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.ability.WebBrowsing;
import org.openqa.selenium.WebDriver;

public abstract class WebDriverInteraction {
    protected WebDriver web(Actor user) {
        return user.ability(WebBrowsing.class).skills();
    }

}
