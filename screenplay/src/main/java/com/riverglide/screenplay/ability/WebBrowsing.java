package com.riverglide.screenplay.ability;

import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class WebBrowsing implements Ability {
    private WebDriver skill = getWebDriver();

    public static WebBrowsing ability() {
        return new WebBrowsing();
    }

    public WebDriver skills() {
        return skill;
    }

    private static WebDriver getWebDriver() {
//        return new HtmlUnitDriver() {
//            @Override
//            protected WebClient modifyWebClient(WebClient client) {
//                client.setCssErrorHandler(new SilentCssErrorHandler());
//                return client;
//            }
//        };

//        WebDriver driver = new PhantomJSDriver(desiredCapabilities());
        WebDriver driver = new FirefoxDriver(desiredCapabilities());
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    private static DesiredCapabilities desiredCapabilities() {
        DesiredCapabilities dCaps = new DesiredCapabilities();
        dCaps.setJavascriptEnabled(true);
        dCaps.setCapability("takesScreenshot", false);
        return dCaps;
    }
}
