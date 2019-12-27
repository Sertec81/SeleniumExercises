package Selenium_Day_1.Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sinan\\Desktop\\TechnoStudy\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");


//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("TechnoStudy");
//        element.submit();
    }

}