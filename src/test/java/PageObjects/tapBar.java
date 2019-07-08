package PageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testKonfiguration.AppiumSetup;

public class tapBar extends AppiumSetup {
    public tapBar() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Startseite\"]")
    public WebElement Startseite;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Themen\"]")
    public WebElement Themen;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Liveticker\"]")
    public WebElement Liveticker;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Wetter\"]")
    public WebElement Wetter;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Einstellungen\"]")
    public WebElement Einstellung;

}
