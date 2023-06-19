package homework_week11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
public class MultiBrowserUltimateEqa {

    static String browser = "Edge";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

    static WebDriver driver;

    public static void main(String[] args) {
        //Launch the multiple browser
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        //Open the URL into browser
            driver.get(baseUrl);

        //Maximise the browser
        driver.manage().window().maximize();

        //Give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        //Print the current url
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Get the page source
        System.out.println("Current page source is: " + driver.getPageSource());

        //Enter the email  into email field
        WebElement emailIdField = driver.findElement(By.name("user[email]"));
        emailIdField.sendKeys("ashish123@gmail.com");

        //Enter the password into the password field
        WebElement password = driver.findElement(By.name("user[password]"));
        password.sendKeys("ashish123");

        //Close the browser
        driver.close();


        }
    }
