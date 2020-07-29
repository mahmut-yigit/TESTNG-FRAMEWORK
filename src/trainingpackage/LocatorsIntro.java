package trainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.util.List;

public class LocatorsIntro {
/*Create a class : LocatorsIntro
Create main method and complete the following task.
When user goes to http://a.testaddressbook.com/sign_in
Locate the elements of email textbox,password textbox, and signin button
Enter below username and password then click sign in button
Username :  testtechproed@gmail.com
Password : Test1234!
Then verify that the expected user id  testtechproed@gmail.com
Verify the "Addresses" and "Sign Out"  texts are displayed
Find the number of total link on the page
Sign out from the page */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe ");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        WebElement signButton = driver.findElement(By.name("commit"));
        signButton.click();

        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
        WebElement userId = driver.findElement(By.className("navbar-text"));
        System.out.println(userId.getText());

        String actualUserId = userId.getText();
        String expectedUserId = "testtechproed@gmail.com";
        if (actualUserId.equals(expectedUserId)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Actual ID: " + actualUserId);
            System.out.println("Expected ID: " + expectedUserId);
        }
        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        WebElement addressLink = driver.findElement(By.linkText("Addresses"));
        String actualAddressLinkText = addressLink.getText();
        String expectedAddressLinkText = "Addresses";
        if (actualAddressLinkText.equals(expectedAddressLinkText)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actual address link text: " + actualAddressLinkText);
            System.out.println("Expected Address ink Text: " + expectedAddressLinkText);

            //<a class="nav-item nav-link" data-test="sign-out" rel="nofollow"
            // data-method="delete" href="/sign_out">Sign out</a>
        }
        String expectedSignOutLinkText = "Sign Out";

        WebElement signOutTex = driver.findElement(By.linkText("Sign out"));
        String actualSignOutLinkText = signOutTex.getText();

        if (actualSignOutLinkText.equals(expectedSignOutLinkText)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("Actual address link text: " + actualSignOutLinkText);
            System.out.println("Expected address link text: " + expectedSignOutLinkText);
        }

        List<WebElement> listOfLinkElements = driver.findElements(By.tagName("a"));
        System.out.println("There are " + listOfLinkElements.size() + " links on the page");
        System.out.println("The first webelement: " + listOfLinkElements.get(0));
        System.out.println("The first text: " + listOfLinkElements.get(0).getText());
        System.out.println("The second text: " + listOfLinkElements.get(1).getText());
        System.out.println("The third text: " + listOfLinkElements.get(2).getText());

        for (WebElement element : listOfLinkElements) {
            System.out.println(element.getText());
        }
        WebElement addressByPartialLinkText=driver.findElement(By.partialLinkText("dresse"));
        String addressStringByPartialLinkText=addressByPartialLinkText.getText();
        System.out.println("Address by partial link text: "+ addressStringByPartialLinkText);

        WebElement signOutByPartialLinkText=driver.findElement(By.partialLinkText("ign"));
        String signOutStringByPartialLinkText=signOutByPartialLinkText.getText();
        System.out.println("Sign out by partial link text: "+signOutStringByPartialLinkText);




        signOutTex.click();
    }
}



