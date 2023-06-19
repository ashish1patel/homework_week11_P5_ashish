package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-5 - Project Name: com-utimateqa
 * BaseUrl =
 * https://courses.ultimateqa.com/users/sign_in
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ultimatEqa {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the URL into browser
        driver.get(baseUrl);

        //Maximise Browser
        driver.manage().window().maximize();

        //we give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //Print the current url
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Current source is: " + driver.getPageSource());

        //Enter the email  into email field
        WebElement emailIdField = driver.findElement(By.name("user[email]"));
        emailIdField.sendKeys("ashish123@gmail.com");

        //Enter the password into password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("ashish123");

        //Close the browser
        driver.close();
    }
}
