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
        String alText = alert.getText();
        alText = alText.replace("Your password: ", "");
        System.out.println(alText);
        alert.accept();
        webDriver.switchTo().parentFrame();
        WebElement EnterButton = webDriver.findElement(By.xpath("//*[@id=\"content\"]/button[2]"));
        EnterButton.click();
        Alert alertInput = webDriver.switchTo().alert();
        alertInput.sendKeys(alText);
        alertInput.accept();
        webDriver.switchTo().parentFrame();

        // Searching text 'Great!'
        String TextTaskSixth = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", TextTaskSixth.contains("Great!"));

        WebElement ReturnButton = webDriver.findElement(By.xpath("//*[@id=\"content\"]/button[3]"));
        ReturnButton.click();
        Alert YesIamSureButton = webDriver.switchTo().alert();
        YesIamSureButton.accept();
    }
}