package com.example.selenide.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {
    private By makeDropdown = By.name("marka");
    private By modelDropdown = By.id("akSearchMarki");
    private By drivetrainCheckbox = By.id("f88");
    private By searchButton = By.xpath("//input[@value='Търси']");

    public void searchVolkswagenGolf4WD() {
        openPage("https://www.mobile.bg/search/avtomobili-dzhipove/vw/namira-se-v-balgariya");
        waitForElement(makeDropdown);
        $(modelDropdown).selectOption("VW");
        $(drivetrainCheckbox).click();
        $(searchButton).click();
    }
}
