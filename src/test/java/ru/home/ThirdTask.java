package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ThirdTask extends WebDriverInit {

    @Test
    @Order(3)
    public void SeleniumPracticeTasks() throws InterruptedException {

        /*
         * Third task check
         */

        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement searchThirdTask = webDriver.findElement(By.xpath("//*[@id=\"select\"]"));
        searchThirdTask.click();
        Duration.ofSeconds(1);
        WebElement DropDownList = webDriver.findElement(By.xpath("//*[@id=\"content\"]/select[1]/option[6]"));
        DropDownList.click();
        Duration.ofSeconds(1);
        WebElement CheckList = webDriver.findElement(By.xpath("//*[@id=\"content\"]/select[2]/option[1]"));
        CheckList.click();
        Duration.ofSeconds(1);
        WebElement ButtonGetResultTaskThree = webDriver.findElement(By.xpath("//*[@id=\"go\"]"));
        ButtonGetResultTaskThree.click();
        Duration.ofSeconds(1);

        // Searching text 'Kenneth Thompson'
        String DropDownListText = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", DropDownListText.contains("Kenneth Thompson"));

        // Searching text 'Java'
        String ListText = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", ListText.contains("Java"));

        WebElement ReturnButtonTaskThree = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
        ReturnButtonTaskThree.click();
        Duration.ofSeconds(1);
    }
}
