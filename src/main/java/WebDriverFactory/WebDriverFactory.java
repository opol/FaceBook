package WebDriverFactory;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Ulyana_Opolska on 4/13/2016.
 */
public class WebDriverFactory {
    private static final String CHROME = "chrome";
    private static final String FIREFOX = "firefox";

    private static WebDriver webDriver;
    private static DesiredCapabilities dc;
    private WebDriverFactory() {

    }

    public static WebDriver getInstance(String browser) {
        if (webDriver == null) {
            if (CHROME.equals(browser)) {
                setChromeDriver();

                ChromeOptions options = new ChromeOptions();
                //options.addExtensions(paths)
                options.addArguments("test-type");
                dc = DesiredCapabilities.chrome();
                dc.setCapability(ChromeOptions.CAPABILITY, options);

                webDriver = new ChromeDriver(dc);

            } else if (FIREFOX.equals(browser)) {
                FirefoxProfile fp = new FirefoxProfile();
                //fp.addExtension(extensionToInstall)
                // new File(
                //	"C:\\Users\\Taras\\AppData\Local\Mozilla\Firefox\Profiles\o2l1s7ao.default-1422611077331"));
                //   new File("" +
                //	"C:\\Users\\Taras\\AppData\\Local\\Mozilla" +
                //	"\\Firefox\\Profiles\\o2l1s7ao.default-1422611077331"));
                dc = DesiredCapabilities.firefox();
                dc.setCapability(FirefoxDriver.PROFILE, fp);

                webDriver = new FirefoxDriver(dc);

            } else
                throw new RuntimeException("Invalid browser property set in configuration file");
        }

        return webDriver;
    }

    private static void setChromeDriver() {
        String osName = System.getProperty("os.name").toLowerCase();
        StringBuffer chromeBinaryPath = new StringBuffer(
                "src/main/resources/drivers/");

        if (osName.startsWith("win")) {
            chromeBinaryPath.append("chrome-win/chromedriver.exe");
        } else if (osName.startsWith("lin")) {
            chromeBinaryPath.append("chrome-lin/chromedriver");
        } else if (osName.startsWith("mac")) {
            chromeBinaryPath.append("chrome-mac/chromedriver");
        } else
            throw new RuntimeException("Your OS is invalid for webdriver tests");

        System.setProperty("webdriver.chrome.driver",
                chromeBinaryPath.toString());
    }

    /*public static WebDriver getInstance(String browser) {

        webDriver = new FirefoxDriver();



        return webDriver;
    }*/
}
