package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.interaction.webdriver.ItContains;
import com.riverglide.screenplay.action.interaction.webdriver.ItSays;

import static com.riverglide.screenplay.action.interaction.webdriver.ItContains.itContains;
import static com.riverglide.screenplay.action.interaction.webdriver.ItSays.itSays;

public class It {
    public static Perform says(String something) {
        return itSays(something);
    }

    public static Perform contains(Integer expectedNumberOfItems) {
        return itContains(expectedNumberOfItems);
    }
}
