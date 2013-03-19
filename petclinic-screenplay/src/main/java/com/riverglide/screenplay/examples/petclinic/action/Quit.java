package com.riverglide.screenplay.examples.petclinic.action;

import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.action.interaction.QuitTheBrowser;

public class Quit {
    public static Perform theBrowser() {
        return QuitTheBrowser.quitTheBrowser();
    }
}
