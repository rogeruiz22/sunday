import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AppTest {
    @Test
    public void firstTest() throws Exception {
        System.setProperty("webdriver.chrome.driver","/c/Users/Roger Ruiz/IdeaProjects/sunday/src/main/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://captive.apple.com/");

        driver.manage().window().maximize();

        WebElement successMessage = driver.findElement(By.xpath("//body[contains(text(), 'Success')]"));

        Assert.assertEquals(successMessage, "success", "Something happened !");
    }
}
