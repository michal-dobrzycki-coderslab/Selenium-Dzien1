package konfiguracja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie02 {
    public static void main(String[] args) {

        // na podstawie example.GoogleSearch
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://coderslab.pl/pl");

        waitOneSecond();

        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        waitOneSecond();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        waitOneSecond();

        driver.quit();
    }

    private static void waitOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
