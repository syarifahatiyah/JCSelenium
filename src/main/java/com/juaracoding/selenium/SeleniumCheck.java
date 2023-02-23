package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SeleniumCheck {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ("https://demoqa.com/select-menu");
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title Header :" + title);
        //driver.findElement(By.xpath("//*[@id='alertButton']")).click();

        WebElement selectColor = driver.findElement(By.id("oldSelectMenu"));
        Select color = new Select(selectColor);
        color.selectByValue("10");
        color.selectByIndex(9);
        color.deselectByVisibleText("Magenta");
        System.out.println("Test Select");

        System.out.println("Delay 5 Detik");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        System.out.println("Quit Browser");

    }
}

