package stepsDefinitions;

import Utils.DriverManager;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {
    WebDriver driver = DriverManager.getDriver();

    @Dado("que o utilizador está no ecrã de login do SauceDemo")
    public void abrirPaginaLogin() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @Quando("o utilizador insere as credenciais válidas")
    public void inserirCredenciaisValidas() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @Então("ele deve ver ecrã inicial com a lista de produtos")
    public void verificarEcrãInicial() {
        assertEquals(driver.findElement(By.className("title")).getText(), ("Products"));
        DriverManager.quitDriver();
    }
}