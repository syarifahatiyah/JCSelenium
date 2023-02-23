package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = ("https://demoqa.com/checkbox");
        driver.get(url);
        System.out.println("Get URL");
        driver.manage().window().maximize();
        System.out.println("Maximize Browser");

        driver.getTitle();
        String titleHeader = driver.getTitle();
        System.out.println("title Header :" +titleHeader);

        //CheckBox
        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button")).click();
        driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/label/span[3]")).click();
        String txtDownload = driver.findElement(By.xpath("//*[@id='result']/span[2]")).getText();
        System.out.println(txtDownload);


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
