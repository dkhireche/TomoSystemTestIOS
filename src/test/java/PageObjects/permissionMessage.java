package PageObjects;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import testKonfiguration.AppiumSetup;

public class permissionMessage extends AppiumSetup {

    public permissionMessage() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Erlauben\"]")
    public static WebElement Erlauben;

    @iOSFindBy(xpath = "	//XCUIElementTypeButton[@name=\"Nicht erlauben\"]")
    public WebElement NichtErlauben;

}
