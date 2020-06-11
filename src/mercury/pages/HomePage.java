package mercury.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By lnkHome = By.linkText("Home");
    By lnkFlights = By.linkText("Flights");
    By lnkHotels = By.linkText("Hotels");
    By lnkCarRentals = By.linkText("Car Rentals");
    By lnkCruises = By.linkText("Cruises");
    By lnkDestinations = By.linkText("Destinations");
    By lnkVacations = By.linkText("Vacations");
    By lnkSIGNON = By.linkText("SIGN-ON");
    By lnkREGISTER = By.linkText("REGISTER");
    By lnkSUPPORT = By.linkText("SUPPORT");
    By lnkCONTACT = By.linkText("CONTACT");
    By txtUserName = By.name("userName");
    By pwPass = By.name("password");
    By btnlogin = By.name("login");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLnkHome(){
        driver.findElement(lnkHome).click();
    }

    public void clicklnkFlights(){
        driver.findElement(lnkFlights).click();
    }

    public void clicklnkHotels(){
        driver.findElement(lnkHotels).click();
    }

    public void clicklnkCarRentals(){
        driver.findElement(lnkCarRentals).click();
    }

    public void clicklnkCruises(){
        driver.findElement(lnkCruises).click();
    }

    public void clicklnkDestinations(){
        driver.findElement(lnkDestinations).click();
    }

    public void clicklnkVacations(){
        driver.findElement(lnkVacations).click();
    }

    public void clicklnkSIGNON(){
        driver.findElement(lnkSIGNON).click();
    }

    public void clicklnkREGISTER(){
        driver.findElement(lnkREGISTER).click();
    }

    public void clicklnkSUPPORT(){
        driver.findElement(lnkSUPPORT).click();
    }

    public void clicklnkCONTACT(){
        driver.findElement(lnkCONTACT).click();
    }

    public void entertxtUserName(){
        driver.findElement(txtUserName).sendKeys("");
    }

    public void enterPass(){
        driver.findElement(pwPass).sendKeys("");
    }

    public void submitLogin(){
        driver.findElement(btnlogin).click();
    }

    public String getTitleText(){
        return driver.getTitle();
    }
}
