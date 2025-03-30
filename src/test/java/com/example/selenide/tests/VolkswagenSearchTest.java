package com.example.selenide.tests;

import com.example.selenide.config.WebDriverManagerConfig;
import com.example.selenide.pages.HomePage;
import com.example.selenide.pages.SearchResultsPage;

public class VolkswagenSearchTest {
    public static void main(String[] args) {
        // Initialize WebDriver with WebDriverManagerConfig
        WebDriverManagerConfig.setup();

        // Start the test
        HomePage homePage = new HomePage();
        homePage.searchVolkswagenGolf4WD();

        // Process search results
        SearchResultsPage searchResults = new SearchResultsPage();
        int total = searchResults.getTotalListings();
        int vip = searchResults.getVIPListings();
        int top = searchResults.getTOPListings();
        int best = searchResults.getBESTListings();

        // Print results to console
        System.out.println("Total Volkswagen Golf 4WD listings: " + total);
        System.out.println("VIP listings: " + vip);
        System.out.println("TOP listings: " + top);
        System.out.println("BEST listings: " + best);
    }
}
