package com.riverglide.screenplay.action;

import com.riverglide.screenplay.Perform;
import org.openqa.selenium.By;

import static com.riverglide.screenplay.action.interaction.webdriver.ReadTheTextOfThe.readTheTextOfThe;

public class ReadTheText {
    public static Perform ofThe(By elementLocation) {
        return readTheTextOfThe(elementLocation);
    }
}
