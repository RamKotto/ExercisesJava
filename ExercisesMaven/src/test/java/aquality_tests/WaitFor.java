package aquality_tests;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class WaitFor {

    @Test
    public void myFirstTest() {
        Browser browser = AqualityServices.getBrowser();
        browser.goTo("https://mail.a1qa.com/");

        JavascriptExecutor js = ((JavascriptExecutor) browser.getDriver());
//        browser.waitForPageToLoad();
        js.executeScript("return document['readyState'] ? 'complete' === document.readyState : true");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        browser.quit();
    }
}
