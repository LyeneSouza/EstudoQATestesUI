package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src\\test\\resources\\features",
        glue = "steps",
        //tags = {},
        stepNotifications = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
)
public class RunnerTest {

    private static WebDriver driver;

//    @BeforeClass
//    public static void reset() {
//        driver = new ChromeDriver();
//        driver.get("https://seubarriga.wcaquino.me/");
//        driver.findElement(By.id("email")).sendKeys("lyene@souza");
//        driver.findElement(By.name("senha")).sendKeys("1234");
//        driver.findElement(By.tagName("button")).click();
//        driver.findElement(By.linkText("reset")).click();
//        driver.quit();
//    }
}
