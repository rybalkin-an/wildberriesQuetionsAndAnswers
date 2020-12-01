package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement faqButton = $("a.faq-btn");

    @Step("Выполнено нажатие на ссылку Частые вопросы")
    public FaqPage goToFaqPage(){
        faqButton.click();
        return new FaqPage();
    }
}
