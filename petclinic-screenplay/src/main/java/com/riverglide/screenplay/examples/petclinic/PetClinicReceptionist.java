package com.riverglide.screenplay.examples.petclinic;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class PetClinicReceptionist implements Role {
    private Actor actor;
    private WebDriver webBrowsingAbility = webBrowsingAbility();

    public PetClinicReceptionist() {
        actor = new Actor().with(webBrowsingAbility);
    }

    @Override
    public Actor actor() {
        return actor;
    }

    private HtmlUnitDriver webBrowsingAbility() {
        return new HtmlUnitDriver() {
            @Override
            protected WebClient modifyWebClient(WebClient client) {
                client.setCssErrorHandler(new SilentCssErrorHandler());
                return client;
            }
        };
    }
}
