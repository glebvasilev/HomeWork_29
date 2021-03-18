package ru.home;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SortingFromLow_High extends WebDriverInit {

    @Test
    @Order(3)
    public void SeleniumPracticeTasks() {

        /*
         * Sorting from Low to High
         */

        webDriver.get("https://www.saucedemo.com/");

        auth();

        WebElement SortingLHButton = webDriver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[3]"));
        SortingLHButton.click();
        pause(1);
    }
}