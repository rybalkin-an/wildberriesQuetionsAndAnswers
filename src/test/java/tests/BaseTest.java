package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({ScreenShooter.class})
public class BaseTest {
    protected final String host = "https://www.wildberries.ru/";

    @BeforeMethod
    protected void Setup() {
        System.out.println("Working");
        Configuration.startMaximized = true;
        Configuration.remote = "http://selenoid:4444/wd/hub";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }
}
