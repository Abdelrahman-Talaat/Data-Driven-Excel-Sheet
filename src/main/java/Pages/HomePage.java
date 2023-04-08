package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By getMessageLocator= By.xpath("//marquee[@class='heading3']");
    private By getManagerIdLocator=By.xpath("//td[@style='color: green']");
    private By clickChangePasswordLocator=By.xpath("//a[@href='PasswordInput.php']");
    private By clickAddNewCustomerLocator=By.xpath("//a[@href='addcustomerpage.php']");
    private By clickAddNewAccountLocator=By.xpath("//a[@href='addAccount.php']");
    private  By clickDeleteAccountLocator=By.xpath("//a[@href='deleteAccountInput.php']");
    private By clickBalanceInquiryLocator=By.xpath("//a[@href='BalEnqInput.php']");
    private By clickCustomizedStatement=By.xpath("//a[@href='CustomisedStatementInput.php']");
    private By clickDeleteCustomerLocator=By.xpath("//a[@href='DeleteCustomerInput.php']");
    private By clickMiniStatementLocator=By.xpath("//a[@href='MiniStatementInput.php']");
    private By clickEditCustomerLocator=By.xpath("//a[@href='EditCustomer.php']");
    private By clickFundTransferLocator =By.xpath("//a[@href='FundTransInput.php']");
    private By clickDepositLocator=By.xpath("//a[@href='DepositInput.php']");
    private By clickWithdrawalLocator=By.xpath("//a[@href='WithdrawalInput.php']");
    private By clickLogoutLocator=By.xpath("//a[@href='Logout.php']");


    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getWelcomeMessage(){
        return driver.findElement(getMessageLocator).getText();
    }
    public String getManagerId(){
      return   driver.findElement(getManagerIdLocator).getText();
    }

}
