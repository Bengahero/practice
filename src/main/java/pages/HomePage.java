package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public String checkTitle(){
        return driver.getTitle();
    }
    public String checkUrl(){
        return driver.getCurrentUrl();
    }
}
