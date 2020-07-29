package trainingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        /*
        1.On the same class, Navigate to amazon home page "https://www.amazon.com/"
        2.Navigate back to google
        3.Navigate forward to amazon
        4.Refresh the page
        5.Maximize the window
        6.Close/Quit the browser
         */
        driver.get("https://www.google.com/");

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.quit();

    }
}
