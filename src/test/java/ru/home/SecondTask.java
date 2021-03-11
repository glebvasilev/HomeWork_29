package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SecondTask extends WebDriverInit {

    @Test
    @Order(2)
    public void SeleniumPracticeTasks() throws InterruptedException {

        /*
         * Second task check
         */

        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement searchSecondTask = webDriver.findElement(By.xpath("//*[@id=\"checkbox\"]"));
        searchSecondTask.click();
        Duration.ofSeconds(1);
        WebElement CheckBoxOne = webDriver.findElement(By.xpath("//*[@id=\"one\"]"));
        CheckBoxOne.click();
        Duration.ofSeconds(1);
        WebElement CheckBoxTwo = webDriver.findElement(By.xpath("//*[@id=\"two\"]"));
        CheckBoxTwo.click();
        Duration.ofSeconds(1);
        WebElement ButtonGetResult = webDriver.findElement(By.xpath("//*[@id=\"go\"]"));
        ButtonGetResult.click();
        Duration.ofSeconds(1);

        // Searching text 'one two'
        String checkboxText = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", checkboxText.contains("one two"));

        WebElement RadioThree = webDriver.findElement(By.xpath("//*[@id=\"radio_three\"]"));
        RadioThree.click();
        Duration.ofSeconds(1);
        WebElement ButtonGetResultTaskTwo = webDriver.findElement(By.xpath("//*[@id=\"radio_go\"]"));
        ButtonGetResultTaskTwo.click();
        Duration.ofSeconds(1);

        // Searching text 'three'
        String radioText = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", radioText.contains("three"));

        // Searching text 'Great! Return to menu'
        String returnTextTaskTwo = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", returnTextTaskTwo.contains("Great! Return to menu"));

        WebElement ReturnButtonTaskTwo = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
        ReturnButtonTaskTwo.click();
        Duration.ofSeconds(1);
    }
}
