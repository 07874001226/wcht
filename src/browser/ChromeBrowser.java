package browser;
/*
"https://www.wcht.org.uk/";
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser {
    //Main Method
    public static void main(String[] args) {
        String baseUrl = "https://www.wcht.org.uk/";
        WebDriver driver;//Declare a driver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");//System setProperty (key,driver path)
        driver = new ChromeDriver();//creat an object for url
        driver.manage().window().maximize();//maximise the window
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Wait till 10 seconds
        driver.get(baseUrl);//Open the browser with url
        String title = driver.getTitle();//Get the title
        System.out.println(title);//Print statement

        //driver.close();//Driver close

    }
}
