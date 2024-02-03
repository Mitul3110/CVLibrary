package searchpage;

import org.apache.commons.beanutils.converters.ByteArrayConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Searchpage {

    WebDriver driver;

//    WebElement iframe = driver.findElement(By.id("gdpr-consent-notice"));
  //  private By iframe =By.id("gdpr-consent-notice");

    private By cookies = By.xpath("//button[@id=\"save\"]/span/div");

    private By jobtitle = By.cssSelector("[maxlength='400']");

    private By location = By.className("hp-loc autocomplete ui-autocomplete-input form__input");

    private By distance = By.cssSelector("#mob-distance");

    private By findjobs = By.cssSelector("[value='Find Jobs']");

    private By text= By.xpath("//h1[@class=\"search-header__title\"]");

    public Searchpage(WebDriver driver) {
        this.driver = driver;
    }

    //public void setIframe(){
      //  driver.switchTo().frame(iframe);

    public void setCookies() throws InterruptedException {

        driver.switchTo().frame("gdpr-consent-notice");

        driver.findElement(cookies).click();

        Thread.sleep(1000);
    }

    public void setJobtitle(String name) {
       driver.findElement(jobtitle).sendKeys(name);

    }

    public void setLocation(String name) {
        driver.findElement(location).sendKeys(name);
    }

    public void setDistance(String name) {
        driver.findElement(distance).sendKeys(name);
    }

    public void setFindjobs() {
        driver.findElement(findjobs).click();
    }

    public String setText(){ return driver.findElement(text).getText();

    }
    public String geturl(){
       return driver.getCurrentUrl();
    }
}