package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FifthTask extends WebDriverInit {

        @Test
        @Order(1)
        public void SeleniumPracticeTasks() {

                /*
                 * First task check
                 */

                webDriver.get("https://savkk.github.io/selenium-practice/");

                WebElement searchFifthTask = webDriver.findElement(By.xpath("//*[@id=\"iframe\"]"));
                searchFifthTask.click();
                Duration.ofSeconds(1);
                webDriver.switchTo().frame("code-frame");
                WebElement CodeFrame = webDriver.findElement(By.id("code"));
                String code = CodeFrame.getText();
                code = code.replace("Your code is:", "");
                System.out.println(code);
                WebElement InputCode = webDriver.findElement(By.xpath("//*[@id=\"content\"]/input[1]"));
                InputCode.sendKeys(code);
                WebElement VerifyButton = webDriver.findElement(By.xpath("//*[@id=\"content\"]/input[2]"));
                VerifyButton.click();

                // Searching text 'Great! Return to menu'
                String returnText = webDriver.findElement(By.tagName("body")).getText();
                Assert.assertTrue("Text not found!", returnText.contains("Great! Return to menu"));

                WebElement ReturnButton = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
                ReturnButton.click();
                Duration.ofSeconds(1);
        }
}
