package com.riverglide.screenplay.ability;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebBrowsingAbility implements Ability {
    private WebDriver ability = getWebDriver();

    public WebDriver ability() {
        return ability;
    }

    private static WebDriver getWebDriver() {
        return new HtmlUnitDriver() {
            @Override
            protected WebClient modifyWebClient(WebClient client) {
                client.setCssErrorHandler(new SilentCssErrorHandler());
                return client;
            }
        };
    }
}
