package com.luma.cucumber.steps;

import com.luma.cucumber.pages.Gear;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GearPageSteps {
    @When("I mouse hoover on gear menu")
    public void iMouseHooverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        new Gear().mouseHooverOnGearMenu();
    }

    @And("I click on bags tab")
    public void iClickOnBagsTab() throws InterruptedException{
        Thread.sleep(2000);
        new Gear().clickOnBags();
    }

    @And("I click on overnight duffle product")
    public void iClickOnOvernightDuffleProduct() {
        new Gear().clickOnProductNameOvernightDuffle();
    }

    @And("I verify the product text {string}")
    public void iVerifyTheProductText(String OvernightDuffle) {
        Assert.assertEquals("Overnight Duffle name is not displayed", new Gear().getTextOvernightDuffle(),OvernightDuffle);
    }

    @And("I change quantity{string}")
    public void iChangeQuantity(String Qty3) {
        new Gear().changeQuantity(Qty3);

    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new Gear().clickAddToCart();
    }

    @And("I verify the text{string}")
    public void iVerifyTheText(String Message) {
        Assert.assertEquals("Product is added to cart is not displayed", new Gear().getTextToVerifyText(),Message);
    }

    @And("I click on shopping cart link from message")
    public void iClickOnShoppingCartLinkFromMessage() {
        new Gear().clickOnShoppingCart();
    }

    @And("I verify the product name {string}")
    public void iVerifyTheProductName(String overnightduffle) {
        Assert.assertEquals("Produt Name is not displayed", new Gear().getTextToVerifyOvernightDuffleInTheCart(),overnightduffle);
    }

    @And("I verify the quantity {string}")
    public void iVerifyTheQuantity(String qty) throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals("quantity is not confirm",new Gear().getTextToVerifyQuantityInTheCart(),qty);
    }

    @And("I verify the product price {string}")
    public void iVerifyTheProductPrice(String Amount)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("total amount is not displayed", new Gear().getTextToVerifyTotalAmountInTheCart(),Amount);

    }

    @And("I change the quantity {string}")
    public void iChangeTheQuantity(String Qty5) throws InterruptedException {
        Thread.sleep(2000);
        new Gear().changeTheQuantity(Qty5);

    }

    @And("I click on update shopping cart")
    public void iClickOnUpdateShoppingCart() {
        new Gear().clickOnUpdateShoppingCart();
    }

    @Then("I can verify the price {string}")
    public void iCanVerifyThePrice(String TotalAmount) {
        Assert.assertEquals("Total Amount is not Displayed", new Gear().getTextToVerifyTotalAmountInTheCartAfterUpdatingQty(),TotalAmount);
    }
}
