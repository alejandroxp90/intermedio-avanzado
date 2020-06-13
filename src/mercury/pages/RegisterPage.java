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

    public void inputFirstName(String strFirstName){
        driver.findElement(iTextFirstName).sendKeys(strFirstName);
    }

    public void inputLastName(String strLastName){
        driver.findElement(iTextLastName).sendKeys(strLastName);
    }

    public void inputPhone(String strPhone){
        driver.findElement(iTextPhone).sendKeys(strPhone);
    }

    public void inputEmail(String streMail){
        driver.findElement(itextUserName).sendKeys(streMail);
    }

    public void address(String strAddress){
        driver.findElement(itextaddress1).sendKeys(strAddress);
    }

    public void city(String strCity){
        driver.findElement(itextCity).sendKeys(strCity);
    }

    public void state(String strState){
        driver.findElement(itextState).sendKeys(strState);
    }

    public void codePostal(String strPostalCode){
        driver.findElement(iTextCodePostal).sendKeys(strPostalCode);
    }

    public void inputCountry(int intCountry){
        Select drpCountry = new Select(driver.findElement(selectCountry));
        drpCountry.selectByIndex(intCountry);
    }

    public void userName(String strUserName){
        driver.findElement(emailUserName).sendKeys(strUserName);
    }

    public void inputPassword(String strPass){
        driver.findElement(passUserName).sendKeys(strPass);
    }

    public void inputConfirmPassword(String strConfirmPass){
        driver.findElement(confirmPassUserName).sendKeys(strConfirmPass);
    }

    public void submitRegister(String strSubmitRegister){
        driver.findElement(submitRegister).click();
    }

    public String getTitleRegister(){
        return driver.getTitle();
    }
}
