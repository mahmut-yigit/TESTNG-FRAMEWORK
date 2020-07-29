package trainingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class VerifyURLTest {
     /*
    Create a new class: VerifyURLTest
    Navigate to google homepage
    Verify if google homepage url is "www.google.com"
     */
     public static void main(String[] args) {
         System.setProperty("webdriver.crom.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\cromdriver.exe");
         WebDriver driver=new ChromeDriver();

         driver.get("https://www.google.com/");

         String actualUrl=driver.getCurrentUrl();
         String expectedUrl="www.google.com";

         if (actualUrl.equals(expectedUrl)){
             System.out.println("PASS");
         }else{
             System.out.println("FAIL");
             System.out.println("Expected Result :"+expectedUrl);
             System.out.println("Actual URL: "+ actualUrl);

         }



     }

}
