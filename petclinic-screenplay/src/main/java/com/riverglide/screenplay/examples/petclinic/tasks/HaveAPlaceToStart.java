package com.riverglide.screenplay.examples.petclinic.tasks;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Ensure;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.interaction.It;
import com.riverglide.screenplay.examples.petclinic.interaction.ReadTheText;
import com.riverglide.screenplay.examples.petclinic.screen.Home;

public class HaveAPlaceToStart implements Perform {

    public void performAs(Actor actor) {
        actor.doesTheFollowing(
            ReadTheText.ofThe(Home.screen().welcomeMessage()),
            Ensure.that(It.says("Welcome"))
        );
    }

    public static HaveAPlaceToStart haveAPlaceToStart() {
        return new HaveAPlaceToStart();
    }
}
