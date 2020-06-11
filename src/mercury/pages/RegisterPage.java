package mercury.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    By iTextFirstName = By.name("firstName");
    By iTextLastName = By.name("lastName");
    By iTextPhone = By.name("phone");
    By itextUserName = By.name("userName");
    By itextaddress1 = By.name("address1");
    By itextCity = By.name("city");
    By itextState = By.name("state");
    By iTextCodePostal = By.name("postalCode");
    By selectCountry = By.name("country");
    By emailUserName = By.id("email");
    By passUserName = By.name("password");
    By confirmPassUserName = By.name("confirmPassword");
    By submitRegister = By.name("register");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(){
        driver.findElement(iTextFirstName).sendKeys("Alejandro");
    }

    public void inputLastName(){
        driver.findElement(iTextLastName).sendKeys("Juarez");
    }

    public void inputPhone(){
        driver.findElement(iTextPhone).sendKeys("5555225588");
    }

    public void inputEmail(){
        driver.findElement(itextUserName).sendKeys("alexdf08@hotmail.com");
    }

    public void address(){
        driver.findElement(itextaddress1).sendKeys("Lago peipus 18");
    }

    public void city(){
        driver.findElement(itextCity).sendKeys("cdmx");
    }

    public void state(){
        driver.findElement(itextState).sendKeys("DF");
    }

    public void codePostal(){
        driver.findElement(iTextCodePostal).sendKeys("05050");
    }

    public void inputCountry(){
        Select drpCountry = new Select(driver.findElement(selectCountry));
        drpCountry.selectByVisibleText("MEXICO");
    }

    public void userName(){
        driver.findElement(emailUserName).sendKeys("alexdf08@hotmail.com");
    }

    public void inputPassword(){
        driver.findElement(passUserName).sendKeys("123qwe");
    }

    public void inputConfirmPassword(){
        driver.findElement(confirmPassUserName).sendKeys("123qwe");
    }

    public void submitRegister(){
        driver.findElement(submitRegister).click();
    }

    public String getTitleRegister(){
        return driver.getTitle();
    }



}
