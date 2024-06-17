package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String sideMenu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_xpath = "Sign In Portal";
    public static String products_xpath = "Online Products";

    public static void click_sideMenu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(sideMenu_xpath)).click();
    }

    public static void click_signIn() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_xpath)).click();
    }

    public static void click_products() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(products_xpath)).click();
    }

}