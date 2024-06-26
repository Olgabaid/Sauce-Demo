import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemoLocators {
    @Test
    public void locators () {
        // Установите путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"));
        driver.findElement(By.name("password"));
        driver.findElement(By.className("submit-button"));
        driver.findElement(By.tagName("input"));

        driver.findElement(By.xpath("//input[@id='user-name']"));
        driver.findElement(By.xpath("//input[@type='submit']"));
        driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        driver.findElement(By.xpath("//input[contains(@id,'user')]"));
        driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
        driver.findElement(By.xpath("//div[text()='Swag Labs']//ancestor::div"));
        driver.findElement(By.xpath("//div[@class='login-box']//descendant::input"));
        driver.findElement(By.xpath("//div[@class='login-box']//following::div"));
        driver.findElement(By.xpath("//input[@id='user-name']//parent::div"));
        driver.findElement(By.xpath("//div[@class='login-box']//preceding::div"));
        driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='user-name']"));

        driver.findElement(By.cssSelector(".submit-button"));
        driver.findElement(By.cssSelector(".login-box"));
        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector("input.input_error"));
        driver.findElement(By.cssSelector("input[type='submit']"));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.linkText("Sauce Labs Bike Light"));
        driver.findElement(By.partialLinkText("Backpack"));

        driver.quit();
    }
}