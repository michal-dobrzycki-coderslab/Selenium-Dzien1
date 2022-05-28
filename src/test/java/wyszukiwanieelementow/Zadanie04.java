package wyszukiwanieelementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie04 {
    public static void main(String[] args) {

        // zadanie 3 przekopiowane
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

        // zadanie 4 - musimy tutaj poczekać na przeładowanie strony

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstNameInput.sendKeys("Mieszko");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
        lastNameInput.sendKeys("Pierwszy");

        // email już powinien być wypełniony z poprzedniego kroku

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='passwd']"));
        passwordInput.sendKeys("Password1");

        WebElement registerButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        registerButton.click();

        // zadanie 5 (po zarejestrowaniu użytkownika)

        WebElement myAddressesElement = driver.findElement(By.cssSelector("a[title='Addresses']"));
        WebElement myPersonalInfoElement = driver.findElement(By.cssSelector("a[title='Information']"));

    }
}
