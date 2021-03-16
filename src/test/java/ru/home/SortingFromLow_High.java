package ru.home;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class SortingFromLow_High extends WebDriverInit {

    @Test
    @Order(4)
    public void SeleniumPracticeTasks() {

        /*
         * Sorting from Low to High
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
        WebElement SortingLHButton = webDriver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[3]"));
        SortingLHButton.click();
        Duration.ofSeconds(1000);
    }
}