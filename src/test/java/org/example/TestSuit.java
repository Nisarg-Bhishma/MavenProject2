package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    SuccessfullyRegistered successfullyRegistered=new SuccessfullyRegistered();
    ComputersPage computersPage=new ComputersPage();
    DesktopPage desktopPage=new DesktopPage();
    DigitalStorm digitalStorm=new DigitalStorm();
    ProductEmailAFriend productEmailAFriend=new ProductEmailAFriend();
    SuccessfullyReferProductToAFriend successfullyReferProductToAFriend=new SuccessfullyReferProductToAFriend();
    ElectronicsPage electronicsPage=new ElectronicsPage();
    CellPhonesPage cellPhonesPage=new CellPhonesPage();
    AddProductsToCart addProductsToCart=new AddProductsToCart();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    SuccessfullyAddedProductsToShoppingCart successfullyAddedProductsToShoppingCart=new SuccessfullyAddedProductsToShoppingCart();


    @Test
    public void VerifyUserShouldRegisterSuccessfully(){
        //Click on Register Button
        homePage.ClickOnRegistrButton();
        //Fill Register Form
        registerPage.RegisterForm();
        //Click on Register Button, RegisterForm
        registerPage.ClickOnSubmitRegister();
        //User is able to register successfully
        successfullyRegistered.VerifyUserRegisteredSuccessfully();
    }
  @Test
    public void registerUserShouldBeAbelToReferProductSuccessfully(){
      //VerifyUserShouldRegisterSuccessfully();
      homePage.ClickOnRegistrButton();
      //Fill Register Form
      registerPage.RegisterForm();
      //Click on Register Button, RegisterForm
      registerPage.ClickOnSubmitRegister();
      //Click on Computers
      computersPage.ClickonComputers();
      //Click on Desktop
      desktopPage.ClickOnDesktop();
      //Click on Digital_Strom
      digitalStorm.ClickOnDigitalStrom();
      //Type a message
      //Click on Email a Friend button
      productEmailAFriend.ClickOnEmailAFriendButton();
      //SuccessMessage
      successfullyReferProductToAFriend.VerifySuccessMessageToReferProductAFriend();
      //successfullyRegistered.VerifySuccessMessageToReferProductAFriend();
    }
    @Test
    public void UserShouldBeAbleToAddProductToBasketSuccessfully(){
        //Click on Electronics
        electronicsPage.ClickOnElectronics();
        //Click on CellPhones
        cellPhonesPage.ClickOnCellPhone();
        //Click on 2 cellphones to add to cart
        addProductsToCart.ClickOnAddToCartButton();
        //Click on shopping-cart button
        shoppingCartPage.ClickOnShoppingCart();
        //Verify shopping cart products
        successfullyAddedProductsToShoppingCart.VerifyAddedProductsToShoppingCart();
    }
}
