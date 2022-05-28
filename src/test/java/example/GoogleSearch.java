package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        // zwróćcie uwagę czy wersja pobranego drivera https://chromedriver.chromium.org/ jest zgodna z wersją przeglądarki zainstalowaną w systemie

        // dla linuxa i macosa
        // System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");

        // dla windowsa
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // google.com wyrzuca popup dla Selenium (odpala się tryb sandbox), bing nie wyrzuca więc na początek będzie łatwiej

        driver.get("http://www.bing.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();

        // driver.quit();
        // jeżeli zakomentujemy driver.quit() to process chromedriver będzie wciąż odpalony ale przeglądarka zostanie włączona
        // zabijamy je na windowsie komendą: taskkill /f /im chromedriver.exe
    }
}
