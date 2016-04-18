package pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.Page;

/**
 * Created by Ulyana_Opolska on 4/18/2016.
 */
public class HomePage extends Page {

    @FindBy(how = How.XPATH, using = ".//*[@id='pagelet_welcome_box']/ul/li[1]/div/a")
    private WebElement welcomeBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='pagelet_welcome_box']/ul/li[2]/div/a")
    private WebElement editProfileBtn;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
}
