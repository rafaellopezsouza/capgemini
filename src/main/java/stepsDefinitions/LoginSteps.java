package stepsDefinitions;

import PageObject.LoginPage;
import PageObject.ProductsPage;
import Utils.DriverManager;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class LoginSteps {
    WebDriver driver = DriverManager.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Dado("que o utilizador está no ecrã de login do SauceDemo")
    public void abrirPaginaLogin() {
        loginPage.openPage();
    }

    @Quando("o utilizador insere as credenciais válidas")
    public void inserirCredenciaisValidas() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Então("ele deve ver ecrã inicial com a lista de produtos")
    public void verificarEcrãInicial() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.verifyTitle();
        DriverManager.quitDriver();
    }
}
