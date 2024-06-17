package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String product_formalshoes = "//*[text()='Formal Shoes']";

    public static String product_sportsshoes = "//*[text()='Sports']";

    public static String product_sneakers = "//*[text()='Sneakers']";

    public static void visibility_product_formalshoes() throws InterruptedException {
        String actualproduct_fs = driver.findElement(By.xpath(product_formalshoes)).getText();
        assertEquals("Formal Shoes",actualproduct_fs);
    }

    public static void visibility_product_sportsshoes() throws InterruptedException {
        String actualproduct_ss = driver.findElement(By.xpath(product_sportsshoes)).getText();
        assertEquals("Sports",actualproduct_ss);
    }

    public static void visibility_product_sneakershoes() throws InterruptedException {
        String actualproduct_s = driver.findElement(By.xpath(product_sneakers)).getText();
        assertEquals("Sneakers",actualproduct_s);
    }

}