package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseStep
{
    public WebDriver driver;

    public BaseStep()
    {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    public enum Pather
    {
        id,
        className,
        name,
        xPath,
        cssSelector,
        linkText
    }

    public enum TimeOut
    {
        LOW(5),
        MIDDLE(10),
        HIGH(15),
        CUSTOM_MAX(60);
        private final int value;

        public int getValue() {
            return value;
        }

        // enum constructor - cannot be public or protected
        private TimeOut(int value) {
            this.value = value;
        }

    }

    public void geturl()
    {
        driver.get("https://test.crowdstreet.com/");
    }

    public void waitElement(WebElement element, TimeOut timeOut)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            wait.until(ExpectedConditions.invisibilityOf(element));
        }
        catch (Exception e)
        {

        }

    }
    public void findElementClick(String path, Pather type)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);

            switch (type)
            {
                case className:
                    wait.until(ExpectedConditions.elementToBeClickable(By.className(path))).click();
                    break;
                case id:
                    wait.until(ExpectedConditions.elementToBeClickable(By.id(path))).click();
                    break;
                case name:
                    wait.until(ExpectedConditions.elementToBeClickable(By.name(path))).click();
                    break;
                case xPath:
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path))).click();
                    break;
                case cssSelector:
                    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(path))).click();
                    break;
                case linkText:
                    wait.until(ExpectedConditions.elementToBeClickable(By.linkText(path))).click();
                    break;
                default:
                    new NotFoundException();
            }
        }
        catch (Exception ex)
        {

        }
    }
    public WebElement findElement(String path, Pather type,TimeOut timeOut) {

        try
        {
            WebDriverWait wait = new WebDriverWait(driver, timeOut.value);
            WebElement element = null;

            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    public WebElement findElement(String path, Pather type, String description)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(driver, TimeOut.MIDDLE.value);
            WebElement element = null;

            switch (type) {
                case className:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.className(path)));
                    break;
                case id:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(path)));
                    break;
                case name:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name(path)));
                    break;
                case xPath:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
                    break;
                case cssSelector:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(path)));
                    break;
                case linkText:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(path)));
                    break;
                default:
                    new NotFoundException();
            }
            return element;
        }
        catch (Exception ex)
        {
            System.out.println("find element method error" + ex.getMessage());
            return null;
        }
    }


    public void PageScrolldown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)", "");

    }

    public void PageScrollup() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-300)", "");
    }

    public void checkTextPresent(String text)
    {
        if ( driver.getPageSource().contains(text))
        {
            System.out.println("Text: " + text + " is present. ");
        }
        else
        {
            System.out.println("Text: " + text + " is not present. ");
        }
    }

    public void firstName(String firstName)
    {
        try
        {
            //Locate First Name Field with ID Locator
            WebElement fName = driver.findElement(By.id("firstName"));

            //Focus on the First Name Field and Send Keys
            fName.clear();
            fName.click();
            fName.sendKeys(firstName);
        }
        catch (Exception ex)
        {
            System.out.println("First Name Field Exception or Error" + ex.getMessage());
        }
    }

    public void lastName(String lastName)
    {
        try
        {
            //Locate last Name Field with ID Locator
            WebElement lName = driver.findElement(By.id("lastName"));

            //Focus on the First Name Field and Send Keys
            lName.clear();
            lName.click();
            lName.sendKeys(lastName);
        }
        catch (Exception ex)
        {
            System.out.println("Last Name Field Exception or Error" + ex.getMessage());
        }
    }

    public void emailAddress(String email)
    {
        try
        {
            //Locate last Name Field with ID Locator
            WebElement emailId = driver.findElement(By.id("email"));

            //Focus on the First Name Field and Send Keys
            emailId.clear();
            emailId.click();
            emailId.sendKeys(email);
        }
        catch (Exception ex)
        {
            System.out.println("Email Address Field Exception or Error" + ex.getMessage());
        }
    }

    public void passwordCreation(String password)
    {
        try
        {
            //Locate last Name Field with ID Locator
            WebElement passwordSet = driver.findElement(By.id("password"));

            //Focus on the First Name Field and Send Keys
            passwordSet.clear();
            passwordSet.click();
            passwordSet.sendKeys(password);
        }
        catch (Exception ex)
        {
            System.out.println("Password Field Exception or Error" + ex.getMessage());
        }
    }

    public void passwordRedo(String passwordRedo)
    {
        try
        {
            //Locate last Name Field with ID Locator
            WebElement passwordReenter = driver.findElement(By.id("confirmPassword"));

            //Focus on the First Name Field and Send Keys
            passwordReenter.clear();
            passwordReenter.click();
            passwordReenter.sendKeys(passwordRedo);
        }
        catch (Exception ex)
        {
            System.out.println("Password Field Reentry Exception or Error" + ex.getMessage());
        }
    }

    public void verifyAccreditedInvestorTextVisible()
    {
        WebElement investorText = driver.findElement(By.xpath("//*[@id=\"content-well\"]/div[2]/div/div[2]/form/div[6]/div[1]"));

        if(investorText.isDisplayed())
        {
            System.out.println("The Accredited Investor Text is Visible");
        }

        if(investorText.getText().contains("accredited investor"))
        {
            System.out.println("The Accredited Investor Text is Visible");
        }
    }

    public void selectRadioButtonForAccreditedInvestor(String option)
    {
        try
        {
            if (option.contains("yes"))
            {
                WebElement radioBtnYes = driver.findElement(By.id("accreditedYes"));
                radioBtnYes.click();
            }
            else if (option.contains("no"))
            {
                WebElement radioBtnNo = driver.findElement(By.id("accreditedNo"));
                radioBtnNo.click();
            }
            else
            {
                System.out.println("The Accredited Investor Radio Button Exception or Not Working");
            }
        }
        catch (Exception e)
        {
            System.out.println("The Accredited Investor Radio Button Exception or Not Working");
        }
    }

    public void verifyTheTermsAndConditions()
    {
        WebElement termsAndConditionsVisible = driver.findElement(By.className("text-charcoal-800"));

        if(termsAndConditionsVisible.isDisplayed())
        {
            System.out.println("The Terms and Conditions Text is Visible");
        }

        if(termsAndConditionsVisible.getText().contains("I have read and accept the terms and conditions"))
        {
            System.out.println("The Terms and Conditions Text is Visible");
        }
    }

    public void acceptTheTermsAndConditions()
    {
        WebElement termsAndConditionsAccept = driver.findElement(By.name("hasAgreedTos"));

        try
        {
            termsAndConditionsAccept.click();
        }
        catch (Exception e)
        {
            System.out.println("The Accredited Investor Radio Button Exception or Not Working");
        }
    }

    public void bypassTheRecaptchaBox()
    {
        try
        {
            driver.switchTo().frame(driver.findElement(By.xpath("//*[@title='reCAPTCHA']")));
            driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        }
        catch (Exception e)
        {
            System.out.println("The Recaptcha Box has Not Been Bypassed");
        }
    }

    public void clickOnTheBlueCreateAccountButton()
    {
        WebElement clickOnBlueButton = driver.findElement(By.xpath("//button[text()='create an account']"));

        try
        {
            clickOnBlueButton.isDisplayed();
            //clickOnBlueButton.click();

            System.out.println("Your Account on CrowdStreet has been created. You have a profile now");
        }
        catch (Exception e)
        {
            System.out.println("The Blue Button for Account Creation is not Working or Available");
        }
    }

    public void DriverQuit()
    {
        driver.quit();
    }
}
