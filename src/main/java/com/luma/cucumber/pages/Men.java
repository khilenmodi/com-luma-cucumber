package com.luma.cucumber.pages;

import com.luma.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men extends Utility {
    private static final Logger log = LogManager.getLogger(Men.class.getName());

    public Men (){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
    WebElement men;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/a[1]/span[2]")
    WebElement bottom;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @CacheLookup
    @FindBy(xpath = "//img[@alt='Cronus Yoga Pant ']")
    WebElement CronusYogaPant;

    @CacheLookup
    @FindBy(css = "#option-label-size-143-item-175")
    WebElement size32;

    @CacheLookup
    @FindBy( xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement colourBlack;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement AddToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement message;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement ShoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement ShoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement ProductMessage;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement SizeMessage;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement ColourMessage;



    public void mouseHoverOnElementMen()throws InterruptedException{
        Thread.sleep(1000);
        mouseHoverToElement(men);
    }

    public void mouseHoverOnElementBottom(){
        mouseHoverToElement(bottom);
    }
    public void clickOnElementPants(){
        clickOnElement(pants);
    }
    public void mouseHoverOnElementCronusYogaPant(){
        mouseHoverToElement(CronusYogaPant);
    }
    public void mouseHooverOnCronusYogaPantAndClickOnSize32() {
        mouseHoverToElement(CronusYogaPant);
        clickOnElement(size32);
    }
    public void mouseHooverOnCronusYogaPantAndClickColourBlack(){
        clickOnElement(colourBlack);
    }
    public void mouseHooverOnCronusYogaPantAndClickAddToCart(){
        clickOnElement(AddToCart);
    }
    public String getTextCronusYogaPantToYourShoppingCart() {
        return getTextFromElement(message);

    }
    public void clickOnShoppingCartLink(){
        clickOnElement(ShoppingCartLink);

    }
    public String getTextShoppingCartMessage() {
        return getTextFromElement(ShoppingCartMessage);

    }
    public String getTextProductName() {
        return getTextFromElement(ProductMessage);

    }
    public String getTextSizeMessage() {
        return getTextFromElement(SizeMessage);

    }
    public String getTextColorMessage() {
        return getTextFromElement(ColourMessage);

    }

}
