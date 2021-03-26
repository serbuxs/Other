import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class formFill {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://account.habr.com/login";

        driver.get(url);

        WebElement email = driver.findElement(By.id("email_field"));
        WebElement password = driver.findElement(By.id("password_field"));

        email.sendKeys("sbukhovets@gmail.com");
        password.sendKeys("proSerique5");
        System.out.println("TextFields are filled!");

        WebElement login = driver.findElement(By.name("go"));
        login.click();

        System.out.println("Login done!");

        driver.close();
    }
}
