package trainingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.SimpleTimeZone;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
     /*
    Create a new class: VerifTitleTest
    Navigate to google homepage
    Verify if google title is "Google"
     */
        driver.get("https://www.google.com/");
     String actualTitle=driver.getTitle();
     String expectedTitle="Google";

     if (actualTitle.equals(expectedTitle)){
         System.out.println("PASS");
     }else{
         System.out.println("FAIL");
         System.out.println("Expected Title : "+expectedTitle);
         System.out.println("Actual Title : "+actualTitle);
     }
     driver.quit();
    }
}
