package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;
    private static final String input_username_id = "user-name";
    private static final String input_password_id = "password";
    private static final String button_login_id = "login-button";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterUsername(String username) {
        driver.findElement(By.id(input_username_id)).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id(input_password_id)).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.id(button_login_id)).click();
    }
}
