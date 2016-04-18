package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pages.Header;
import pages.pages.LoginPage;
import testBase.TestBase;

/**
 * Created by Ulyana_Opolska on 4/18/2016.
 */
public class HeaderTest extends TestBase{

    @Test
    public void enterHomePageView() {

       LoginPage lp = new LoginPage(webDriver);
        Header header = lp.initHeader();
        Assert.assertTrue(header.isFbLogoDisplayed(), "FbLogo is not displayed");
        Assert.assertTrue(header.isSearchFldDisplayed(), "SearchFld is not displayed");
        Assert.assertTrue(header.isProfileBarDisplayed(), "ProfileBar is not displayed");
        Assert.assertTrue(header.isHomeBtnDisplayed(), "HomeBtn is not displayed");
        Assert.assertTrue(header.isFindFriendsBtnDisplayed(), "FindFriendsBtn is not displayed");
        Assert.assertTrue(header.isMessagesBtnDisplayed(), "MessagesBtn is not displayed");
        Assert.assertTrue(header.isNotificationsBtnDisplayed(), "NotificationsBtn is not displayed");
        Assert.assertTrue(header.isPrivacyShortcutsBtnDisplayed(), "PrivacyShortcutsBtn is not displayed");
        Assert.assertTrue(header.isNavigationArrwDisplayed(), "NavigationArrw is not displayed");
    }
}
