package com.example.selenide.config;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConfig {

    public static void setup() {
        // Automatically download and use the latest ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Set Selenide browser to Chrome
        Configuration.browser = "chrome";

        // Run in headless mode if needed
        Configuration.headless = false; // Change to true if you don’t want a visible browser

        // Set browser window size
        Configuration.browserSize = "1366x768";

        System.out.println("WebDriver setup completed.");
    }
}
