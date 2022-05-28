package konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie01 {
    public static void main(String[] args) {

        // na podstawie example.GoogleSearch
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // google.com wyrzuca popup dla Selenium (odpala się tryb sandbox), bing nie wyrzuca więc na początek będzie łatwiej

        driver.get("http://www.bing.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Robert Makłowicz");
        element.submit();

        driver.quit();
    }
}
