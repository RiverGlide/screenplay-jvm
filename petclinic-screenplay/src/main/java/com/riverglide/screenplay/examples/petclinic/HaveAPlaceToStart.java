package com.riverglide.screenplay.examples.petclinic;

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
