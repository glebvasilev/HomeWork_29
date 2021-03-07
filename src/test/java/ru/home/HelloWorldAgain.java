package ru.home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldAgain {
    private WebDriver webDriver;

    @Before
    public void setup(){

    }

    @Test
    public void helloWorldAgain() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();

        /*
         * Going to google.com and print Hello World
         */

        webDriver.get("https://www.google.com/");

        WebElement searchInput = webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        searchInput.sendKeys("Hello World");
        searchInput.submit();

        String title = webDriver.getTitle();

        Assert.assertTrue(title.contains("Hello World"));

        /*
         * Going to saucedemo.com with login and password
         */

        webDriver.get("https://www.saucedemo.com/");

        WebElement login = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        login.sendKeys("standard_user");
        Thread.sleep(1000);
        WebElement pass = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass.sendKeys("secret_sauce");
        Thread.sleep(1000);
        WebElement log = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        log.click();
        Thread.sleep(1000);

        /*
         * Going to saucedemo.com with wrong login and wrong password
         */

        webDriver.get("https://www.saucedemo.com/");

        WebElement login_err = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        login_err.sendKeys("fake_user");
        Thread.sleep(1000);
        WebElement pass_err = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        pass_err.sendKeys("fake_sauce");
        Thread.sleep(1000);
        WebElement log_err = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        log_err.click();
        Thread.sleep(1000);
    }

    @After
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
