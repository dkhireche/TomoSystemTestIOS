package steps;

import PageObjects.permissionMessage;
import PageObjects.tapBar;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.de.Dann;
import cucumber.api.java.de.Gegebensei;
import cucumber.api.java.de.Und;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;
import static testKonfiguration.AppiumSetup.appStart;
import static testKonfiguration.AppiumSetup.close;

public class sharedSteps {
    private Scenario scenario;

    @Before
    public void setUp(Scenario scenario) throws MalformedURLException, InterruptedException {

        this.scenario = scenario;
        appStart();

    }

    @After
    public void closeDriver() {
        close();
    }


    @Gegebensei("^User hat die Permission erlaubt$")
    public  void erlauben() throws InterruptedException {
        tapBar tapbar = new tapBar();

        System.out.println("Tarik");
        permissionMessage permission = new permissionMessage();
        // elementExists(permission_message.Erlauben, 5);
        permission.Erlauben.click();
        System.out.println("Permission ist erlaubt");

        sleep(1000);
    }
    @Dann("^Klickt auf Themen$")
    public void themenAnklicken() {
        tapBar tapbar = new tapBar();
        tapbar.Themen.click();
    }

    @Und("^Klickt auf Liveticker$")
    public void LiveticketAnklciken() {
        tapBar tapbar = new tapBar();
        tapbar.Liveticker.click();
    }
    @Dann("^Wetter$")
    public void wetterAnklciken() {
        tapBar tapbar = new tapBar();
        tapbar.Themen.click();
    }

}
