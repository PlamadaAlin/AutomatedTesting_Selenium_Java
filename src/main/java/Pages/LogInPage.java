package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.BrowserDriver;

public class LogInPage extends BrowserDriver {

    public static String username_id = "usr";
    public static String password_id = "pwd";
    public static String login_xpath ="//*[@id=\"second_form\"]/input";
    public static String register_id ="NewRegistration";

    public static void type_username() throws InterruptedException {
        driver.findElement(By.id(username_id)).sendKeys("Scott.gale@gmail.com");
    }

    public static void type_password() throws InterruptedException {
        driver.findElement(By.id(password_id)).sendKeys("P@sword!");
    }

    public static void click_login()
    {
        driver.findElement(By.xpath(login_xpath)).click();
    }

    public static void click_NewRegister()
    {
        driver.findElement(By.id(register_id)).click();
    }

}