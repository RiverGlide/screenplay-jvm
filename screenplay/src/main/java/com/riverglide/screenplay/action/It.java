package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.interaction.webdriver.ItSays;

import static com.riverglide.screenplay.action.interaction.webdriver.ItSays.itSays;

public class It {
    public static Perform says(String something) {
        return itSays(something);
    }
}
