package basico;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Ejercicio001TestNG {

    private WebDriver driver;
    public String xChromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";

    /* Metodo para navegar a la pagina antes de correr el test*/

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", xChromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

    }

    @Test
    @Parameters({"author","searchKey"})
    public void testParameterWithXML(@Optional("Abc") String author, String searchKey) throws InterruptedException{

        WebElement searchText = driver.findElement(By.name("q"));
        //Searching text in google text box
        searchText.sendKeys(searchKey);

        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        System.out.println("Thread will sleep now");
        Thread.sleep(3000);
        System.out.println("Value in Google Search Box = "+searchText.getAttribute("value") +" ::: Value given by input = "+searchKey);
        //verifying the value in google search box
        Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

    }

    @AfterTest
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }
}
