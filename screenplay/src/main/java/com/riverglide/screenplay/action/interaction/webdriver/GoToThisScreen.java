package com.riverglide.screenplay.action.interaction.webdriver;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Screen;
import com.riverglide.screenplay.Perform;

public class GoToThisScreen extends WebDriverInteraction implements Perform {

    private final String url;

    public static GoToThisScreen goToThis(Screen place){
        return new GoToThisScreen(place.address());
    }

    public void performAs(Actor user) {
        web(user).get(url);
    }

    private GoToThisScreen(String url) {
        this.url = url;
    }
}