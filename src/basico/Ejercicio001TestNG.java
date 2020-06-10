package basico;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ejercicio001TestNG {

    private WebDriver driver;

    private String userName = "";
    private String password = "";
    public String xChromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    /* Metodo para navegar a la pagina antes de correr el test*/

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", xChromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

    }

    @Test
    public void loginY(){
        System.out.println("Inicio del Test 01");


    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
