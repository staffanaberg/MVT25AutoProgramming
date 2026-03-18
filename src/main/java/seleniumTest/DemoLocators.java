package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class DemoLocators {

    static void main() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        WebElement element1 = driver.findElement(By.className("topic-html-content-header"));
        System.out.println(element1.getText());

       /* WebElement element2 = driver.findElement(By.xxxx(""));
        System.out.println(element2.getText());

        WebElement element3 = driver.findElement(By.xxxx(""));
        System.out.println(element3.getText());*/

        Thread.sleep(3000);
        driver.quit();
    }


}
