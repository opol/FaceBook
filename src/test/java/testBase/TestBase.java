package testBase;

import WebDriverFactory.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pages.pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ulyana_Opolska on 4/15/2016.
 */
public class TestBase {
    protected WebDriver webDriver;
    protected LoginPage loginPage;

    @BeforeTest
    @Parameters({"browserName"})
    public void setup(String browserName) throws Exception {
        webDriver = WebDriverFactory.getInstance(browserName);
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //webDriver.manage().window().maximize();
        webDriver.get("https://facebook.com/");
        loginPage = PageFactory.initElements(webDriver, LoginPage.class);


    }

    @AfterTest
    public void tearDown() throws Exception {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
