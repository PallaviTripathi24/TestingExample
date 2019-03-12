package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.List;

public class QueOne {
    public static void main(String[] args)throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.close();
        }
    }

