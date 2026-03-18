package seleniumTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class AddTwoNumbers {

    static void main() throws InterruptedException {

        Scanner scan = new Scanner(System.in);


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/button[1]/p")).click();

    }

}
