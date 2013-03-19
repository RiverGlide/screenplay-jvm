package com.riverglide.screenplay.examples.petclinic.action;

import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

import static com.riverglide.screenplay.examples.petclinic.action.interaction.ReadTheTextOfThe.readTheTextOfThe;

public class ReadTheText {
    public static Perform ofThe(By elementLocation) {
        return readTheTextOfThe(elementLocation);
    }
}
