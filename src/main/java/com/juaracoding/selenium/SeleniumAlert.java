package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumAlert {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = ("https://demoqa.com/alerts");
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        String title = driver.findElement(By.className("main-header")).getText();
        System.out.println("title Header :" + title);
        //driver.findElement(By.xpath("//*[@id='alertButton']")).click();

        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
        System.out.println("Alert OK Clicked");

        driver.findElement(By.id("timerAlertButton")).click();
        driver.switchTo().alert().accept();
        System.out.println("Alert OK Clicked");

        driver.findElement(By.id("confirmButton")).click();
        driver.switchTo().alert().accept();
        System.out.println("Alert OK Clicked");

        driver.findElement(By.id("promtButton")).click();
        driver.findElement(By.id("promtButton")).sendKeys("Syarifah");
        driver.switchTo().alert().accept();
        System.out.println("Alert OK Clicked");

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
