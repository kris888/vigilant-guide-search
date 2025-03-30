package com.example.selenide.pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class BasePage {
    protected void openPage(String url) {
        open(url);
    }

    protected void waitForElement(By locator) {
        $(locator).shouldBe(visible);
    }

    protected void click(By locator) {
        $(locator).click();
    }

    protected void setText(By locator, String text) {
        $(locator).setValue(text);
    }
}
