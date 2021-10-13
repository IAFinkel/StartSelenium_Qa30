import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
//open site
        wd = new ChromeDriver();
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        //открывает ссылку
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        //открывает ссылку и записывает переходы по сайту (каждый шаг)
       // wd.navigate().forward();
    }

    @Test
    public void testName(){
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector(".container"));//поиск по class name
        wd.findElement(By.cssSelector("#root"));// поиск по id
        wd.findElement(By.cssSelector("[href='/login']"));//поиск элемента с атрибутом href имеющего значение '/login'

        wd.findElement(By.cssSelector("[href]"));//по атрибуту
        wd.findElement(By.cssSelector("[href^='/lo']"));// начинается с /lo
        wd.findElement(By.cssSelector("[href $='in']"));//заканчивается на in
        wd.findElement(By.cssSelector("[href *='ogi']"));//содержит ogi





        //click login button

    }

    @Test
    public void testName2(){

    }

    @AfterMethod
    public void postCondition(){

        //wd.close();//закрывает только ту вкладку на которой фокус
        //wd.quit();//закрывает все вкладки

    }
}
