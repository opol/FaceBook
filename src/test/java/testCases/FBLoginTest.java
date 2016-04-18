package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import testBase.TestBase;

/**
 * Created by Ulyana_Opolska on 4/13/2016.
 */
public class FBLoginTest extends TestBase {


    @Test
    public void fbLoginTest() {

        loginPage.logIn();
        Assert.assertEquals(webDriver.getCurrentUrl(), "https://www.facebook.com/?sk=welcome", "Urls do not match");

    }


}
