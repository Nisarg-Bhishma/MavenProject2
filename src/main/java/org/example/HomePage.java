package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util{
    private By _RegisterButton=By.linkText("Register");
    public void ClickOnRegistrButton(){
        clickOnElement(_RegisterButton);
    }
}