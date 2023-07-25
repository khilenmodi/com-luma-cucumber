package com.luma.cucumber.steps;

import com.luma.cucumber.pages.Women;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WomenPageSteps {
    @When("I Mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new Women().mouseHoverOnWomen();
    }

    @And("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new Women().mouseHoverOnTop();
    }

    @And("I Click on Jackets")
    public void iClickOnJackets() {
        new Women().clickOnJacket();
    }

    @And("I Select Sort By filter {string}")
    public void iSelectSortByFilter(String ProductName) {
        new Women().selectProductNameFilter(ProductName);
    }

    @Then("Verify the products name display in alphabetical order")
    public void verifyTheProductsNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals("Product filter not displayed", new Women().getProductList1(),new Women().getProductList2());
    }

    @And("I Select Sort By Price filter {string}")
    public void iSelectSortByPriceFilter(String Price) {
        new Women().selectSortPrice();
    }

    @Then("Verify the products price display inLow to High")
    public void verifyTheProductsPriceDisplayInLowToHigh() {
        Assert.assertEquals("Price Not Displayed from low to high", new Women().getPriceList1(),new Women().getPriceList2());
    }
}
