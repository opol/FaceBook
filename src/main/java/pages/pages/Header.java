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
public class Header extends Page {


    @FindBy(how = How.XPATH, using = "./[@id='blueBarDOMInspector']/div[1]/div/div/div/div[1]/div[1]/h1/a/span")
    private WebElement fbLogo;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_6_2']/div[3]")
    private WebElement searchFld;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_0_1e']/div[1]/div[1]/div/a")
    private WebElement profileBar;

    @FindBy(how = How.ID, using = "u_0_d")
    private WebElement homeBtn;

    @FindBy(how = How.ID, using = "findFriendsNav")
    private WebElement findFriendsBtn;

    @FindBy(how = How.ID, using = "js_b")
    private WebElement friendRequestsBtn;

    @FindBy(how = How.ID, using = "js_c")
    private WebElement messagesBtn;

    @FindBy(how = How.ID, using = "js_d")
    private WebElement notificationsBtn;

    @FindBy(how = How.ID, using = "js_e")
    private WebElement privacyShortcutsBtn;

    @FindBy(how = How.ID, using = "userNavigationLabel")
    private WebElement navigationArrw;


    public Header(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean isFbLogoDisplayed() {
        return fbLogo.isDisplayed();
    }

    public boolean isSearchFldDisplayed() {
        return searchFld.isDisplayed();
    }

    public boolean isProfileBarDisplayed() {
        return profileBar.isDisplayed();
    }

    public boolean isHomeBtnDisplayed() {
        return homeBtn.isDisplayed();
    }

    public boolean isFindFriendsBtnDisplayed() {
        return findFriendsBtn.isDisplayed();
    }

    public boolean isMessagesBtnDisplayed() {
        return messagesBtn.isDisplayed();
    }

    public boolean isNotificationsBtnDisplayed() {
        return notificationsBtn.isDisplayed();
    }

    public boolean isPrivacyShortcutsBtnDisplayed() {
        return privacyShortcutsBtn.isDisplayed();
    }

    public boolean isNavigationArrwDisplayed() {
        return navigationArrw.isDisplayed();
    }


}
