package Pages;

import org.openqa.selenium.By;
import Utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String header_registration_xpath = "/html/body/center/h1";


    public static void visibility_first_name_textbox() throws InterruptedException {
        String actual_header_registration_xpath = driver.findElement(By.xpath(header_registration_xpath)).getText();
        assertEquals("User Registration Page",actual_header_registration_xpath);
    }

}