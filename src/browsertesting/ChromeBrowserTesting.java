package browsertesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class ChromeBrowserTesting {

    public static void main(String[] args) {

        // 1. Set up the Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //giving Implicit wait to driver by using implicitly method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        // 4. Print the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // 5. Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: "+ pageSource);


        // 6. Enter the email into username field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("mvthakur2011@gmail.com");

        // 7. Enter the password into the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("Mv123");

        // 8. Close the browser
        driver.close();

    }
}
