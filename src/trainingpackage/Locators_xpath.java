package trainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_xpath {
    public static void main(String[] args) {


/*Create a class : Locators_xpath
Create main method and complete the following task.
When user goes to http://a.testaddressbook.com/sign_in
Locate the elements of email textbox,password textbox, and signin button
Enter below username and password then click sign in button
Username :  testtechproed@gmail.com
Password : Test1234!
Then verify that the expected user id  testtechproed@gmail.com
Verify the Addresses and Sign Out  texts are displayed
Find the number of total link on the page
Sign out from the page*/

        System.setProperty("webdriver.crome.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox=driver.findElement(By.xpath("//input[@type='email']"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTexBox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordTexBox.sendKeys("Test1234!");

        WebElement signInButton=driver.findElement(By.xpath("//input[@type='submit']"));
        signInButton.click();

        //Then verify that the expected user id  testtechproed@gmail.com
        WebElement ID=driver.findElement(By.xpath("//*[contains(text(),'testtechproed@gmail.com')]"));
        System.out.println("ID: "+ID.getText());

        WebElement address=driver.findElement(By.xpath("//a[.='Addresses']"));
        System.out.println("Address: "+ address);

        WebElement signOut=driver.findElement(By.xpath("//*[(text()='Sign out')]"));
        System.out.println("Sing Out: "+ signOut);


    }
}
