package com.luma.cucumber.steps;

import com.luma.cucumber.pages.Men;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenPageSteps {

    @Given("I am On Homepage")
    public void iAmOnHomepage() {

    }

    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu()throws InterruptedException  {
        Thread.sleep(2000);
        new Men().mouseHoverOnElementMen();
    }


    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() throws InterruptedException {
        Thread.sleep(2000);
        new Men().mouseHoverOnElementBottom();
    }

    @And("I Click on Pants")
    public void iClickOnPants() {
        new Men().clickOnElementPants();
    }

    @And("I MouseHover On Cronus Yoga Pant and click on size")
    public void iMouseHoverOnCronusYogaPantAndClickOnSize() {
        new Men().mouseHooverOnCronusYogaPantAndClickOnSize32();

    }


    @And("I Mouse Hover on product name Cronus Yoga Pant and click on colourBlack")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack() {
        new Men().mouseHooverOnCronusYogaPantAndClickColourBlack();
    }

    @And("I Mouse Hover on product name‘Cronus Yoga Pant’ and click on Add To Cart Button")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton() {
        new Men().mouseHooverOnCronusYogaPantAndClickAddToCart();
    }

    @Then("Verify the text {string}")
    public void verifyTheText(String Message) {
        Assert.assertEquals("Message not Displayed", new Men().getTextCronusYogaPantToYourShoppingCart(),Message);
    }

    @And("Click on shopping cart Link into message")
    public void clickOnShoppingCartLinkIntoMessage() {
        new Men().clickOnShoppingCartLink();
    }

    @Then("Verify the text Message {string}")
    public void verifyTheTextMessage(String ShoppingCart) {
        Assert.assertEquals("shopping cart message is not displayed", new Men().getTextShoppingCartMessage(),ShoppingCart);
    }

    @Then("Verify the product name {string}")
    public void verifyTheProductName(String CronusYogaPant) {
        Assert.assertEquals("Product name is not Displayed", new Men().getTextProductName(),CronusYogaPant);
    }

    @Then("Verify the product size {string}")
    public void verifyTheProductSize(String size) {
        Assert.assertEquals("Size Of product is not displayed", new Men().getTextSizeMessage(),size);
    }

    @Then("Verify the product colour {string}")
    public void verifyTheProductColour(String colour) {
        Assert.assertEquals("colour of product is not displayed", new Men().getTextColorMessage(),colour);
    }



}

