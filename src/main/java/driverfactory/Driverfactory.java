package driverfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driverfactory {

    //Mitul work
    public static ThreadLocal<WebDriver>tslocal= new ThreadLocal<>();

  public  WebDriver initbrowser(String browser){
  System.out.println("Browser name is "+   browser);
    if(browser.equals("Firefox")){
          WebDriverManager.firefoxdriver().setup();
          tslocal.set(new FirefoxDriver());
      }
    else if(browser.equals("chrome")){
        WebDriverManager.chromedriver().setup();
        tslocal.set(new ChromeDriver());

    }
    else{ System.out.println("Give browser name" +  browser);}

     getdriver().manage().window().maximize();
      getdriver().manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
       getdriver().manage().deleteAllCookies();
      return getdriver();}





   public static WebDriver getdriver(){
        return tslocal.get();
      }}

