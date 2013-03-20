package com.riverglide.screenplay.ability;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebBrowsing implements Ability {
    private WebDriver skill = getWebDriver();

    public static WebBrowsing ability() {
        return new WebBrowsing();
    }

    public WebDriver skills() {
        return skill;
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
