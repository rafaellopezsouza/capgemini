package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Screenshot {

    /**
     * Captura um screenshot e o salva no diretório src/screenshots.
     *
     * @param driver   Instância do WebDriver.
     */
    public static void take(WebDriver driver) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String directory = "src/screenshots";
            File dir = new File(directory);
            if (!dir.exists()) {
                dir.mkdirs();
            }

            String filename = "screenshot_" + System.currentTimeMillis() + ".png";
            File destino = new File(directory + "/" + filename);

            screenshot.renameTo(destino);

            System.out.println("Screenshot salvo em: " + destino.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
