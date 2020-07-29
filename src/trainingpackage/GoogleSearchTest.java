package trainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
        /*Create a new class : GoogleSeachTest
        Create main method and complete the following task.
        When user goes to https://www.google.com/
        Search for “porcelain teapot”
        And print how many related results displayed on Google
        And click on Shopping*/
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();

            driver.get("https://www.google.com/");
            WebElement googleSearchBox=driver.findElement(By.name("q"));
            googleSearchBox.sendKeys("porcelain teapot");
            googleSearchBox.submit();

            WebElement teapotResults=driver.findElement(By.id("result-stats"));
            System.out.println("Teapot Results: "+teapotResults.getText());

            WebElement shoppingButton=driver.findElement(By.partialLinkText("Αγορές"));
            shoppingButton.click();

            driver.findElement(By.className("xsRiS")).click();
            driver.findElement(By.className("_-le")).click();






        }
}
