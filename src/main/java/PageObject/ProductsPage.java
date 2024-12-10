package PageObject;

import Utils.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductsPage {
    private WebDriver driver;
    private static final String titleProducts = "Products";

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyTitle(){
        Screenshot.take(driver);
        assertEquals(driver.findElement(By.className("title")).getText(), (titleProducts));
    }
}
