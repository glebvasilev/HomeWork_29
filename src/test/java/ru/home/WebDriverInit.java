package ru.home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebDriverInit {

    public WebDriver webDriver;

    @Before
    public void setup(){
        webDriver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void closeDriver() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    public void pause (Integer milliseconds) {
        try {
            TimeUnit.SECONDS.sleep(milliseconds);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void auth() {
        webDriver.get("https://www.saucedemo.com/");

        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        login.sendKeys("standard_user");
        pause(1);
        WebElement pass = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("secret_sauce");
        pause(1);
        WebElement log = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        log.click();
        pause(1);
    }
}

