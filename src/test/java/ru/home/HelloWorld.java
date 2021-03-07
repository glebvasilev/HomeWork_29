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

public class HelloWorld {
    private WebDriver webDriver;

    @Before
    public void setup(){

    }

    @Test
    public void helloWorld() {

        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();
        webDriver.get("https://www.yandex.ru/");

        WebElement searchInput = webDriver.findElement(By.cssSelector("#text"));
        searchInput.sendKeys("Hello World");
        searchInput.submit();

        String title = webDriver.getTitle();

        Assert.assertTrue(title.contains("Hello World"));
    }

    @After
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}
