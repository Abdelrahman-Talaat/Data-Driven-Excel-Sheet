package PagesTest;

import BaseTest.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.readFromExcel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {
      protected LoginPage loginPage;
      protected HomePage homePage;
      protected readFromExcel readFromExcel;
    @Test(dataProvider ="validData" )
    public void validData(String userName, String password){
        loginPage=new LoginPage(driver);
        homePage=new HomePage(driver);
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        var homePage=loginPage.clickLoginButton();
        assertEquals(homePage.getWelcomeMessage(),"Welcome To Manager's Page of Guru99 Bank");
        assertEquals(homePage.getManagerId(),"Manger Id : "+userName);
        System.out.println("Valid Login Test");

    }
    @DataProvider(name = "validData")
    public Object[][] validInputdata() throws IOException, InvalidFormatException {
      readFromExcel obj=new readFromExcel();
      return obj.read();
    }

}

