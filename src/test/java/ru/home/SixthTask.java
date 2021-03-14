package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SixthTask extends WebDriverInit {

    @Test
    @Order(2)
    public void SeleniumPracticeTasks() {

        /*
         * Second task check
         */

        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement searchSixthTask = webDriver.findElement(By.xpath("//*[@id=\"alerts\"]"));
        searchSixthTask.click();
        Duration.ofSeconds(1);
        WebElement GetPassButton = webDriver.findElement(By.xpath("//*[@id=\"content\"]/button[1]"));
        GetPassButton.click();
        Alert alert = webDriver.switchTo().alert();
        alert.getText();
        //alert.replace("Your password:", "");
        System.out.println(alert);

        // Searching text 'Great! Return to menu'
        String returnTextTaskTwo = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", returnTextTaskTwo.contains("Great! Return to menu"));

        WebElement ReturnButtonTaskTwo = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
        ReturnButtonTaskTwo.click();
        Duration.ofSeconds(1);
    }
}
