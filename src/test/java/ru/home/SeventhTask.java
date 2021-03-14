package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SeventhTask extends WebDriverInit {

    @Test
    @Order(3)
    public void SeleniumPracticeTasks() {

        /*
         * Third task check
         */

        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement searchSeventhTask = webDriver.findElement(By.xpath("//*[@id=\"table\"]"));
        searchSeventhTask.click();
        Duration.ofSeconds(1);
        WebElement Checkbox_01 = webDriver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]/input"));
        Checkbox_01.click();
        Duration.ofSeconds(1);
        WebElement Checkbox_02 = webDriver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[3]/td[1]/input"));
        Checkbox_02.click();
        Duration.ofSeconds(1);
        WebElement Delete = webDriver.findElement(By.xpath("//*[@id=\"content\"]/input"));
        Delete.click();
        WebElement Company = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div[1]/input"));
        Company.sendKeys("Umbrella");
        WebElement Contact = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div[2]/input"));
        Contact.sendKeys("Chris");
        WebElement Country = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/form/div[3]/input"));
        Country.sendKeys("USA");
        WebElement AddButton = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/form/input"));
        AddButton.click();

        // Searching text 'Kenneth Thompson'
        String DropDownListText = webDriver.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", DropDownListText.contains("Chris"));

        WebElement ReturnButtonTaskThree = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
        ReturnButtonTaskThree.click();
        Duration.ofSeconds(1);
    }
}
