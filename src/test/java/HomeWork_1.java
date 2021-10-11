import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeWork_1 {

    WebDriver wd;

    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");

    }

    @Test
    public void Test_1(){
        wd.findElement(By.className("container"));
        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("login_login__3EHKB"));


        wd.findElement(By.id("root"));


        wd.findElement(By.tagName("body"));
        wd.findElement(By.tagName("div"));
        wd.findElement(By.tagName("h1"));
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("br"));
        wd.findElement(By.tagName("button"));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));

        wd.findElement(By.partialLinkText("ME"));
        wd.findElement(By.partialLinkText("BOU"));
        wd.findElement(By.partialLinkText("IN"));

    }

    @AfterMethod
    public  void postcondition(){
        wd.quit();
    }
}
