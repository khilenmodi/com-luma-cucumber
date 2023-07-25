package com.luma.cucumber.pages;

import com.luma.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gear extends Utility {
    private static final Logger log = LogManager.getLogger(Gear.class.getName());

    public Gear (){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-6']//span[contains(text(),'Gear')]")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bags;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productDuffle;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Overnight Duffle')]")
    WebElement overnightDuffle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyProductInTheCart;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement verifyQty;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement qtyInTheCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement TotalAmount;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement verifyLastPrice;


    public void mouseHooverOnGearMenu() {
        mouseHoverToElement(gearMenu);

    }

    public void clickOnBags() {
        mouseHoverToElement(bags);
        //mouseHoverToElementAndClick(bags);
        clickOnElement(bags);
    }

    public void clickOnProductNameOvernightDuffle() {
        clickOnElement(productDuffle);

    }

    public String getTextOvernightDuffle() {
        return getTextFromElement(overnightDuffle);
    }

    public void changeQuantity(String qty3) {
        clearTextFromField(qty);
        sendTextToElement(qty, qty3);
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    public String getTextToVerifyText() {
        return getTextFromElement(verifyText);

    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String getTextToVerifyOvernightDuffleInTheCart() {
        return getTextFromElement(verifyProductInTheCart);
    }

    public String getTextToVerifyQuantityInTheCart() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(verifyQty);
    }

    public String getTextToVerifyTotalAmountInTheCart() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(TotalAmount);
    }

    //Change Qty to ‘5’

    public void changeTheQuantity(String Qty)throws InterruptedException  {
        Thread.sleep(2000);
        clearTextFromField(qtyInTheCart);
        sendTextToElement(qtyInTheCart, Qty);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCart);

    }

    // * Verify the product price ‘$225.00

    public String getTextToVerifyTotalAmountInTheCartAfterUpdatingQty() {
        return getTextFromElement(verifyLastPrice);
    }
}



