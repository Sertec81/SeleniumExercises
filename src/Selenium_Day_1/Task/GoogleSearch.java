package Selenium_Day_1.Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    // use selenium to open google and
    // search for techno.study,
    // and click on google search
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sinan\\Desktop\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       driver.get("http://www.techno.study");
       // driver.get("https://www.google.com/");

        driver.get("http://techno.study/program.html");

        WebElement element = driver.findElement(By.id("q"));
        element.sendKeys("TechnoStudy");
        element.submit();
    }

}