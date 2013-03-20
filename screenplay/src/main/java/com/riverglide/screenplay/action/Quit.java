package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.action.interaction.webdriver.QuitTheBrowser;

public class Quit {
    public static Perform theBrowser() {
        return QuitTheBrowser.quitTheBrowser();
    }
}
