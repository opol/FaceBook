package pages.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.Page;

/**
 * Created by Ulyana_Opolska on 4/15/2016.
 */
public class LoginPage extends Page{

    @FindBy(how = How.ID, using = "email")
    private WebElement emailLoginFld;

    @FindBy(how = How.ID, using = "pass")
    private WebElement passLoginFld;

    @FindBy(how = How.ID, using = "loginbutton")
    private WebElement loginBtn;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void logIn(){
        emailLoginFld.clear();
        emailLoginFld.sendKeys("robby.doms@gmail.com");
        passLoginFld.clear();
        passLoginFld.sendKeys("robby.doms123");
        loginBtn.click();

    }

    public Header initHeader() {
        return PageFactory.initElements(webDriver, Header.class);
    }


}
