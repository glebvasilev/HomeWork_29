package ru.home;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SortingFromHigh_Low extends WebDriverInit {

    @Test
    @Order(4)
    public void SeleniumPracticeTasks() {

        /*
         * Sorting from High to Low
         */

        webDriver.get("https://www.saucedemo.com/");

        auth();

        WebElement SortingHLButton = webDriver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[4]"));
        SortingHLButton.click();
        pause(1);
    }
}