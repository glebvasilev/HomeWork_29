package ru.home;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class FourthTask extends WebDriverInit {

    @Test
    @Order(4)
    public void SeleniumPracticeTasks() throws InterruptedException {

        /*
         * Fourth task check
         */

        webDriver.get("https://savkk.github.io/selenium-practice/");

        WebElement searchFourthTask = webDriver.findElement(By.xpath("//*[@id=\"form\"]"));
        searchFourthTask.click();
        Duration.ofSeconds(1);
        WebElement FirstName = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[1]/input"));
        FirstName.sendKeys("Kenneth");
        Duration.ofSeconds(1);
        WebElement LastName = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[2]/input"));
        LastName.sendKeys("Thompson");
        Duration.ofSeconds(1);
        WebElement Email = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[3]/input"));
        Email.sendKeys("KennethThompson@gmail.com");
        Duration.ofSeconds(1);
        WebElement RadioFourth = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[4]/input[2]"));
        RadioFourth.click();
        Duration.ofSeconds(1);
        WebElement Address = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[5]/input"));
        Address.sendKeys("USA");
        Duration.ofSeconds(1);
        WebElement AttachFile = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[6]/input"));
        AttachFile.sendKeys(props.getProperty("path"));
        Duration.ofSeconds(1);
        WebElement TextArea = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/div[7]/textarea"));
        TextArea.sendKeys("Something about me");
        Duration.ofSeconds(1);
        WebElement SendButton = webDriver.findElement(By.xpath("//*[@id=\"testform\"]/input"));
        SendButton.click();
        Duration.ofSeconds(1);

        WebElement ReturnButtonTaskFourth = webDriver.findElement(By.xpath("//*[@id=\"back\"]/a"));
        ReturnButtonTaskFourth.click();
        Duration.ofSeconds(1);
    }
}
