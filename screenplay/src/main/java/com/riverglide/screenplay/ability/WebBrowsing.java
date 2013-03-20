package com.riverglide.screenplay.ability;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class WebBrowsing {
    public static WebDriver ability() {
        return new HtmlUnitDriver() {
            @Override
            protected WebClient modifyWebClient(WebClient client) {
                client.setCssErrorHandler(new SilentCssErrorHandler());
                return client;
            }
        };
    }
}
