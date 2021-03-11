package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FirstTask extends WebDriverInit {

        @Test
        @Order(1)
        public void SeleniumPracticeTasks() throws InterruptedException {

                /*
                 * First task check
                 */

                webDriver.get("https://savkk.github.io/selenium-practice/");

                WebElement searchFirstTask = webDriver.findElement(By.xpath("//*[@id=\"button\"]"));
                searchFirstTask.click();
                Duration.ofSeconds(1);
                WebElement ButtonClickMe = webDriver.findElement(By.xpath("//*[@id=\"first\"]"));
                ButtonClickMe.click();
                Duration.ofSeconds(1);

                // Searching text 'Excellent!'
                String excellentText = webDriver.findElement(By.tagName("body")).getText();
                Assert.assertTrue("Text not found!", excellentText.contains("Excellent!"));

                WebElement ButtonClickMeToo = webDriver.findElement(By.xpath("//*[@id=\"content\"]/input"));
                ButtonClickMeToo.click();
                Duration.ofSeconds(1);

                // Searching text 'Great! Return to menu'
                String returnText = webDriver.findElement(By.tagName("body")).getText();
                Assert.assertTrue("Text not found!", returnText.contains("Great! Return to menu"));

                WebElement ReturnButton = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
                ReturnButton.click();
                Duration.ofSeconds(1);
        }
}
