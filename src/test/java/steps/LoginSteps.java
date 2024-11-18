package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    private WebDriver driver;

    @Dado("que o utilizador está no ecrã de login do SauceDemo")
    public void abrirPaginaLogin() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Quando("o utilizador insere as credenciais válidas")
    public void inserirCredenciaisValidas() {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }

    @Então("ele deve ver ecrã inicial com a lista de produtos")
    public void verificarEcrãInicial() {
        WebElement productsTitle = driver.findElement(By.className("title"));
        assert productsTitle.getText().equals("Products");
        driver.quit();
    }
}
