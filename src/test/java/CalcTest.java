import driverConfig.BROWSER;
import driverConfig.DriverFactory;
import io.qameta.allure.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CalcTest {
@Description("mnnnn")
@Test
    public void test() {
        WebDriver driver = DriverFactory.getDriver(BROWSER.CHROME);
        driver.get("https://ithillel.ua/");

        driver.findElement(By.xpath("//*[@id=\"btn-conmhvjsultation-hero\"]")).click();
    }

}
