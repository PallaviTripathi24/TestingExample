package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Ques12 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/ttn/IdeaProjects/TestingExample/Chromedriver/chromedriver_linux64/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("file:///home/ttn/Downloads/Registration.html");
        List<WebElement> wb = dr.findElements(By.name("Demo"));
        wb.get(0).sendKeys("Harry");
        wb.get(1).sendKeys("Potter");
        wb.get(2).sendKeys("harry.potter@tothenew.com");

    }
    }
