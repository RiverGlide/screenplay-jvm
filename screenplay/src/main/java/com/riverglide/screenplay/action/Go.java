package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Screen;
import com.riverglide.screenplay.Perform;

import static com.riverglide.screenplay.action.interaction.webdriver.GoToThisScreen.goToThis;

public class Go {
    public static Perform toThe(Screen view) {
        return goToThis(view);
    }
}
