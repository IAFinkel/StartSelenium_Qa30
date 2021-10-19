import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        wd.findElement(By.cssSelector(".container"));
        wd.findElement(By.xpath("//*[@class='container']"));

        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector("[class=navbar-component_nav__1X_4m]"));
        wd.findElement(By.cssSelector("[class*=navbar]"));
        wd.findElement(By.cssSelector("[class^=na]"));
        wd.findElement(By.cssSelector("[class$=_4m]"));
        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m"));
        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m[class$=_4m]"));
        wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        wd.findElement(By.className("login_login__3EHKB"));
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        wd.findElement(By.cssSelector("[class=login_login__3EHKB]"));
        wd.findElement(By.cssSelector("[class*='3EH']"));
        wd.findElement(By.cssSelector("[class^=login]"));
        wd.findElement(By.cssSelector("[class$=KB]"));
        wd.findElement(By.cssSelector("div.login_login__3EHKB"));

        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector("#root.container"));
        wd.findElement(By.cssSelector("div#root.container"));
        wd.findElement(By.cssSelector("div#root[class=container]"));
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.tagName("body"));
        wd.findElement(By.cssSelector("body"));

        wd.findElement(By.tagName("div"));
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("div#root"));
        wd.findElement(By.xpath("//div"));

        wd.findElement(By.tagName("h1"));
        wd.findElement(By.cssSelector("h1"));
        wd.findElement(By.cssSelector("div.navbar-component_nav__1X_4m :first-child"));

        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.cssSelector("a[href]"));
        wd.findElement(By.xpath("//a"));


        wd.findElement(By.tagName("input"));
        wd.findElement(By.cssSelector("input"));
        wd.findElement(By.cssSelector("div[class^=login] :first-child"));
        wd.findElement(By.cssSelector("input[placeholder]"));


        wd.findElement(By.tagName("br"));
        wd.findElement(By.cssSelector("br"));

        wd.findElement(By.tagName("button"));
        wd.findElement(By.cssSelector("button"));

        wd.findElement(By.linkText("HOME"));
        wd.findElement(By.cssSelector("[href='/home']"));
        wd.findElement(By.xpath("//*[href='/home']"));

        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.cssSelector("a[href='/about']"));


        wd.findElement(By.linkText("LOGIN"));
        wd.findElement(By.cssSelector("a[href='/login']"));

        wd.findElement(By.partialLinkText("ME"));
        wd.findElement(By.cssSelector("a[href*='me']"));

        wd.findElement(By.partialLinkText("BOU"));
        wd.findElement(By.cssSelector("a[href$='bout']"));
        wd.findElement(By.partialLinkText("IN"));
        wd.findElement(By.cssSelector("a[href$='in']"));

        wd.findElement(By.xpath("//*[starts-with(@href,'/lo')]"));
        wd.findElement(By.xpath("//*[contains(@href,'/lo')]"));



    }

    @AfterMethod
    public  void postcondition(){
        wd.quit();
    }
}
