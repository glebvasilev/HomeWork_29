package ru.home;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingFromA_Z extends WebDriverInit {

    @Test
    @Order(1)
    public void SeleniumPracticeTasks() {

        /*
         * Sorting from A to Z
         */

        webDriver.get("https://www.saucedemo.com/");

        auth();

        WebElement SortingAZButton = webDriver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[1]"));
        SortingAZButton.click();
        pause(1);

        By containerItemsTitles = By.cssSelector("div.inventory_item_name");
        List<String> titles = webDriver.findElements(containerItemsTitles).stream().map(WebElement::getText).collect(Collectors.toList());
        Assert.assertTrue(isSorted(titles));

    }

    public static boolean isSorted(List<String> listOfStrings) {
        if (listOfStrings.isEmpty() || listOfStrings.size() == 1) {
            return true;
        }

        Iterator<String> itr = listOfStrings.iterator();
        String current, previous = itr.next();
        while (itr.hasNext()) {
            current = itr.next();
            if (previous.compareTo(current) > 0) {
                return false;
            }
            previous = current;
        }
        return true;
    }
}