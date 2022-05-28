package wyszukiwanieelementow;

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

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationElement = driver.findElement(By.id("hotel_location"));
        hotelLocationElement.click();
        hotelLocationElement.sendKeys("Warsaw");

        WebElement searchNowElement = driver.findElement(By.id("search_room_submit"));

        // element na samym dole strony
        WebElement emailElement = driver.findElement(By.id("newsletter-input"));
        emailElement.click();
        emailElement.sendKeys("jan@kowalski.pl");

        // driver.quit();
    }
}
