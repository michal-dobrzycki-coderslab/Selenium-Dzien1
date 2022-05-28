package wyszukiwanieelementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie03 {
    public static void main(String[] args) {

        // na podstawie example.GoogleSearch
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // uwaga, nie możemy podać wielu klas po spacji, to nie zadziała
        WebElement signInElement = driver.findElement(By.className("user_login"));
        signInElement.click();

        // to znajdzie pierwszy element pasujący, właśnie o niego nam chodzi
        WebElement emailInput = driver.findElement(By.className("account_input"));
        emailInput.click();
        emailInput.sendKeys("colargol@mis.pl");

        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();

        // driver.quit();
    }
}
