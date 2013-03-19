package com.riverglide.screenplay.examples.petclinic.interaction;

import com.riverglide.screenplay.Perform;

public class Quit {
    public static Perform theBrowser() {
        return QuitTheBrowser.quitTheBrowser();
    }
}
