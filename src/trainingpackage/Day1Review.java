package trainingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Day1Review {
    /*
    Create a new class : Day1Review
Using ChromeDriver, Go to youtube and verify if page title is “youtube”,
If not, print the correct title.
Verify if the page URL contains "youtube" if not, print the right url.
Then Navigate to https://www.amazon.com/
Navigate back to youtube
Refresh the page
Navigate forward to amazon
Maximize the window
Then verify if page title includes “Amazon”, If not, print the correct title.
Verify if the page URL is https://www.amazon.com/, if not print the correct url
Quit the browser
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="youtube";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Title: "+actualTitle);
        }

        String actualYoutubeURL=driver.getCurrentUrl();
        String expectedYoutubeURL="youtube";

        if (actualYoutubeURL.contains(expectedYoutubeURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        System.out.println("YouTube CORRECT URL: "+actualYoutubeURL);

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualTitleAmz=driver.getTitle();
        String expectedTitleAmz="Amazon";

        if (actualTitleAmz.contains(expectedTitleAmz)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("Actual Title: "+ actualTitleAmz);

        String actualAmzUrl=driver.getCurrentUrl();
        String expectedAmzUrl="https://www.amazon.com/";

        if(actualAmzUrl.equals(expectedAmzUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        System.out.println("Actual Url: "+ actualAmzUrl);
        driver.quit();
    }

}
