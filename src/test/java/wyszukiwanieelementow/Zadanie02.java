package wyszukiwanieelementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie02 {
    public static void main(String[] args) {

        // na podstawie example.GoogleSearch
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationElement = driver.findElement(By.name("hotel_location"));
        hotelLocationElement.click();
        hotelLocationElement.sendKeys("Warsaw");

        // element na samym dole strony
        WebElement emailElement = driver.findElement(By.id("newsletter-input"));
        emailElement.click();
        emailElement.sendKeys("jan@kowalski.pl");

        WebElement searchNowElement = driver.findElement(By.name("search_room_submit"));
        // tutaj submit nie zadziała
        searchNowElement.click();

        WebElement subscribeToNewsletterButton = driver.findElement(By.name("submitNewsletter"));

        // driver.quit();
    }
}
