package com.nuraspace.pages;

import com.nuraspace.base.BaseClass;
import org.openqa.selenium.By;

    public class LoginPage extends BaseClass {
        private By loginBtn = By.xpath("//a[contains(text(),'Login')]");

        private By userName = By.id("uName");

        private By passWord = By.id("pass");
        private  By login = By.xpath("//button[contains(text(),'Continue')]");

        HomePage homePage;
        public LoginPage() {
            BaseClass baseClass = new BaseClass();
            baseClass.initialization();
        }

        public void launchURL(String url){
            driver.get(url);
        }
        public void clickOnLoginBtn(){
            driver.findElement(loginBtn).click();

        }
        public void enterUserName(String uNAME){
            driver.findElement(userName).sendKeys(uNAME);
        }


        public void enterPassword(String pass) {
            driver.findElement(passWord).sendKeys(pass);
        }
        public HomePage login(){
            driver.findElement(login).click();
            return new HomePage();
        }

        public HomePage initialLogin(String url, String uNAME,String pass){
            driver.get(url);
            driver.findElement(loginBtn).click();
            driver.findElement(userName).sendKeys(uNAME);
            driver.findElement(passWord).sendKeys(pass);
            driver.findElement(login).click();
            return new HomePage();

        }

        public void closeDriver(){
            driver.close();
        }

    }

