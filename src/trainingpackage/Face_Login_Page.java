package trainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face_Login_Page {
    /*Create a class : Face_Login_Page
    1. go to https://www.facebook.com/
    2. Test if below username and password is valid.
       username="testusername"
       password="testpassword"
    Step 1. locate the username box
    Step 2/ locate the password box
    Step 3. locate the signin button
    Ste4 4. click on the sign in button*/

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        /*WebElement emailTextBox=driver.findElement(By.cssSelector("#email"));
        emailTextBox.sendKeys("testusername");

        WebElement passwordTextBox=driver.findElement(By.cssSelector("#pass"));
        passwordTextBox.sendKeys("testpassword");

        WebElement logInButton=driver.findElement(By.cssSelector("#u_0_b"));
        logInButton.click();*/

        /*Using the same class
1.Find the webelements of
"Sign Up"
"Connect with friends and the world around you on Facebook."
2.Locate and send text to
"First name"=testfirstname
"Last name"=testlastname
"Mobiel number or email"=test@gmail.com
"New Password"=testpassword*/

        WebElement firstNameBox=driver.findElement(By.cssSelector("#u_0_o"));
        firstNameBox.sendKeys("testfirstname");

        WebElement lastNameBox=driver.findElement(By.cssSelector("#u_0_q"));
        lastNameBox.sendKeys("testlastname");

        WebElement emlTextBox=driver.findElement(By.cssSelector("#u_0_t"));
        emlTextBox.sendKeys("test@gmail.com");

        WebElement newPassword=driver.findElement(By.cssSelector("#u_0_y"));
        newPassword.sendKeys("testpassword");

        WebElement radioButton=driver.findElement(By.cssSelector("#u_0_7"));
        radioButton.click();

        WebElement signUpButton=driver.findElement(By.cssSelector("#u_0_15"));
        signUpButton.click();










    }


}
