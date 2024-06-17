package Pages;

import org.openqa.selenium.By;
import Utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class ProductsPage extends BrowserDriver {
    public static String formalshoes_dropdown = "formalshoedropdown";

    public static String formalshoes = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalshoesdropdpown() throws InterruptedException {
        driver.findElement(By.className(formalshoes_dropdown)).click();
    }

    public static String getText_formalshoes() {
        String formalshoesText =  driver.findElement(By.xpath(formalshoes)).getText();
        return formalshoesText;
    }


}