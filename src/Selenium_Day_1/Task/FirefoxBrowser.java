package Selenium_Day_1.Task;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\sinan\\Desktop\\TechnoStudy\\Selenium\\FirefoxDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.techno.study");

    }

}
