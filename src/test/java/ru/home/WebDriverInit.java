package ru.home;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverInit {

    public WebDriver webDriver;

    public static final Properties props;

    static {
        props = new Properties();
        try {
            props.load(WebDriverInit.class.getClassLoader().getResourceAsStream("props.yml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void setup(){
        webDriver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void closeDriver() throws InterruptedException {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}

