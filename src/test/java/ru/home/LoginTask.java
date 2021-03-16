package ru.home;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTask extends WebDriverInit {

        @Test
        @Order(1)
        public void SeleniumPracticeTasks() {

                /*
                 * Login to saucedemo.com
                 */

                webDriver.get("https://www.saucedemo.com/");

                WebElement login = webDriver.findElement(By.xpath("//*[@id=\"user-name\"]"));
                login.sendKeys("standard_user");
                Duration.ofSeconds(1000);
                WebElement pass = webDriver.findElement(By.xpath("//*[@id=\"password\"]"));
                pass.sendKeys("secret_sauce");
                Duration.ofSeconds(1000);
                WebElement log = webDriver.findElement(By.xpath("//*[@id=\"login-button\"]"));
                log.click();
                Duration.ofSeconds(1000);
        }
}