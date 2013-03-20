package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.interaction.webdriver.ItSays;

public class It {
    public static Perform says(String something) {
        return ItSays.itSays(something);
    }
}
