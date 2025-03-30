package com.example.selenide.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SearchResultsPage extends BasePage {
    private By totalAds = By.cssSelector(".tal td:nth-child(2)");
    private By vipAds = By.cssSelector(".vip");
    private By topAds = By.cssSelector(".top");
    private By bestAds = By.cssSelector(".best");

    public int getTotalListings() {
        return $$(totalAds).size();
    }

    public int getVIPListings() {
        return $$(vipAds).size();
    }

    public int getTOPListings() {
        return $$(topAds).size();
    }

    public int getBESTListings() {
        return $$(bestAds).size();
    }
}
