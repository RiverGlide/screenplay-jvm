package com.riverglide.screenplay;

import com.riverglide.screenplay.ability.WebBrowsingAbility;
import org.openqa.selenium.WebDriver;

public abstract class WebDriverInteraction {
    protected WebDriver web(Actor user) {
        return user.ability(WebBrowsingAbility.class);
    }

}
