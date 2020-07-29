package trainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {
/*Create a class : CheckBox_RadioButton
Create main method and complete the following task.
Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes
Then click on checkbox1 if box is not selected
Then click on checkbox2 if box is not selected */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mhmty\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkBox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        System.out.println(checkBox1.isSelected());
        checkBox1.click();
        System.out.println(checkBox1.isSelected());

        WebElement checkBox2=driver.findElement(By.xpath("input[@type='checkbox'])[2]"));
        System.out.println(checkBox2.isSelected());
        checkBox2.click();
        System.out.println(checkBox2.isSelected());




    }



}
