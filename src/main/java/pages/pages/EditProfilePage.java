package pages.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.Page;

/**
 * Created by Ulyana_Opolska on 4/18/2016.
 */
public class EditProfilePage extends Page {
    public EditProfilePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = ".//*[@id='u_jsonp_7_8']/div")
    private WebElement addPhotoBtn;

    @FindBy(how = How.ID, using = "js_p")
    private WebElement uploadPhotoBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='u_jsonp_5_8']/div/a/div")
    private WebElement updateProfilePhotoBtn;

    @FindBy(how = How.XPATH, using = ".//*[@id='facebook']/body/div[7]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/button[2]")
    private WebElement cropAndSaveBtn;


}
