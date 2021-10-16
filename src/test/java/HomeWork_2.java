import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork_2 {
    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }

    @Test
    public void tableHW1(){
        List<WebElement> elements = wd.findElements(By.cssSelector("tr:nth-child(4)"));
        for (WebElement e: elements){
            System.out.println(e.getText());
        }
        System.out.println("---------------------------------------------");

        WebElement element1 = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2"));
        System.out.println(element1.getText());
        System.out.println("---------------------------------------------");

        Assert.assertEquals(element1.getText(),"Francisco Chang");

    }

    @Test
    public void tableHW2(){
        List<WebElement> elements = wd.findElements(By.cssSelector("tr"));
        System.out.println(elements.size());
        System.out.println("---------------------------------------------");

        List<WebElement> elements1 = wd.findElements(By.cssSelector("th"));
        System.out.println(elements1.size());
        System.out.println("---------------------------------------------");

        List<WebElement> elements2 = wd.findElements(By.cssSelector("tr:nth-child(3)"));
        for (WebElement e: elements2){
            System.out.println(e.getText());
        }
        System.out.println("---------------------------------------------");

        List<WebElement> elements3 = wd.findElements(By.cssSelector("tr td:last-child"));
        for (WebElement e: elements3){
            System.out.println(e.getText());
        }
        System.out.println("---------------------------------------------");

        WebElement element4 = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        System.out.println(element4.getText());



    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
