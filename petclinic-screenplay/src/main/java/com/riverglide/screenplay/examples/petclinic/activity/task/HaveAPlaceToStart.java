package com.riverglide.screenplay.examples.petclinic.activity.task;

import com.riverglide.screenplay.Actor;
import com.riverglide.screenplay.Ensure;
import com.riverglide.screenplay.Perform;
import com.riverglide.screenplay.examples.petclinic.action.It;
import com.riverglide.screenplay.examples.petclinic.action.ReadTheText;
import com.riverglide.screenplay.examples.petclinic.location.Home;

public class HaveAPlaceToStart implements Perform {

    public void performAs(Actor actor) {
        actor.doesTheFollowing(
            ReadTheText.ofThe(Home.location().welcomeMessage()),
            Ensure.that(It.says("Welcome"))
        );
    }

    public static HaveAPlaceToStart haveAPlaceToStart() {
        return new HaveAPlaceToStart();
    }
}
