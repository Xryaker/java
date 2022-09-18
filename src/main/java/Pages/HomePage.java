package Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private WebDriver driver;
    //    By courseList = By.className("class=\"block-course-cats_item\"");
    By courseList = By.className("block-course-cats_item");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
@Step("This function ")
    public void testingCourseButtonClick() {
        List<WebElement> listCourse = driver.findElements(courseList);
        for (WebElement element : listCourse) {
            String atrHref = element.findElement(By.tagName("a")).getAttribute("href");
            if (atrHref.contains("testing")) {
                element.click();
                break;
            }
        }
    }
}
