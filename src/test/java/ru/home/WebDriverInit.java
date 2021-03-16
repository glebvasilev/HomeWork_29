package ru.home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class WebDriverInit {

    public WebDriver webDriver;

    @Before
    public void setup(){
        webDriver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void closeDriver() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}

