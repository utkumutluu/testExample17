import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import static java.lang.Thread.sleep;
 public class TestExample {

    @Test
    public void SelecionCreating() throws InterruptedException {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://localhost/DB3/Slim4_WebClient/#/login");
        WebElement AccountUsername = driver.findElement(By.xpath("//div[@id='username']//input"));
        AccountUsername.sendKeys("administrator");
        WebElement password = driver.findElement(By.xpath("//div[@id='password']//input"));
        password.sendKeys("slim4");
        WebElement LogInButton = driver.findElement(By.id("submit"));
        LogInButton.click();
        sleep(10000);
        WebElement SearchBar = driver.findElement(By.xpath("//div[@class='slim-control-group slim-control-group-horizontal online-article-search']//input"));
        SearchBar.sendKeys("CDC10100004");
        sleep(1000);
        WebElement textbox = driver.findElement(By.xpath("//div[@class='slim-control-group slim-control-group-horizontal online-article-search']//input"));
        textbox.sendKeys(Keys.ENTER);
        sleep(5000);
        WebElement openTab = driver.findElement(By.xpath("//header[@class='slim-card-header slim-card-header-collapsible']"));
        openTab.click();
        sleep(5000);
        WebElement AverageDemand = driver.findElement(By.xpath("//div[@class='slim-input-base slim-input-base-mode-inline slim-input-number']//input"));
        AverageDemand.click();
        sleep(500);
        AverageDemand.sendKeys("333");
        sleep(5000);
        WebElement Initialise = driver.findElement(By.xpath("//div[@class='slim-row slim-gutter-h:md slim-align-h:end online-article-save-cancel']//button[@class ='slim-button slim-button-default']"));
        Initialise.click();
        sleep(5000);
        WebElement Save = driver.findElement(By.xpath("//button[@class='slim-button slim-button-primary']"));
        Save.click();
        sleep(5000);
        WebElement TextArea = driver.findElement(By.xpath("//div[@class='slim-flex:auto slim-input slim-input-multiline slim-input-base slim-input-base-mode-default slim-min-height:1']//textarea"));
        TextArea.click();
        TextArea.sendKeys("test");
        sleep(5000);
        WebElement Save2 = driver.findElement(By.xpath("//div[@class='slim-modal-footer']/button[@class='slim-button slim-button-primary']"));
        Save2.click();
    }

}
